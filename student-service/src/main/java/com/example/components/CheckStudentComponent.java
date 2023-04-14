package com.example.components;

import com.example.common.dto.StudentDTO;
import com.example.common.dto.SubjectScoreDTO;
import com.example.common.mappers.StudentMapper;
import com.example.common.mappers.SubjectScoreMapper;
import com.example.common.vo.StudentVO;
import com.example.commonservice.Exceptions.BadRequestException;
import com.example.entities.IndustryCodeEntity;
import com.example.entities.StudentEntranceTestEntity;
import com.example.entities.SubjectEntity;
import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

import static com.example.commonservice.contants.ExceptinonContant.*;

@Component
public class CheckStudentComponent {

    @Autowired
    private StudentEntranceTestService studentEntranceTestService;

    @Autowired
    private  IndustryCodeService industryCodeService;

    @Autowired
    private SubjectService subjectService;


    public ResponseEntity<StudentVO> checkStudent(StudentDTO studentDTO) {
        if (studentDTO.getNumberStudent() != studentDTO.getSubjectScoreDTOList().size()) {
            throw new BadRequestException(NUMBER_STUDENT);
        }
        Calendar calendar = Calendar.getInstance();
        StudentEntranceTestEntity studentEntranceTestEntity = studentEntranceTestService.findBySchoolYear(calendar.get(Calendar.YEAR)).orElseThrow(() -> new BadRequestException(YEARS_OF_NO_EXISTENCE));
        List<IndustryCodeEntity> industryCodeEntityList = industryCodeService.findAll();
        List<SubjectEntity> subjectEntityList = subjectService.findAllByIndustryCode(industryCodeEntityList.stream().map(IndustryCodeEntity::getId).toList());
        int check = 0;
        List<SubjectScoreDTO> subjectScoreDTOList = new ArrayList<>();
        for (SubjectScoreDTO subjectScoreDTO : studentDTO.getSubjectScoreDTOList()) {
            if (studentDTO.getNumberSubject().equals(subjectScoreDTO.getScoreList().size()-1)) {
                throw new BadRequestException(NUMBER_SUBJECT);
            }

            checkTotalStudent(subjectScoreDTO, studentEntranceTestEntity);

            for (IndustryCodeEntity i : industryCodeEntityList) {
                if (subjectScoreDTO.getNameIndustry().equals(i.getNameIndustry())) {
                    List<Integer> subjectEntityIdIndustryCodeList = subjectEntityList.stream().filter(s -> i.getId().equals(s.getIdIndustryCode())).map(SubjectEntity::getCodeSubject).toList();
                    int sum = IntStream.range(0, subjectScoreDTO.getScoreList().size())
                            .filter(subjectEntityIdIndustryCodeList::contains)
                            .map(subjectScoreDTO.getScoreList()::get)
                            .sum();
                    if (i.getTotalIndustryCodeScore() <= sum) {
                        check++;
                        subjectScoreDTOList.add(subjectScoreDTO);
                        break;
                    }
                }

            }

        }
        return ResponseEntity.ok().body(StudentMapper.convertStudentVO(check, studentDTO.getCodeSubject(), SubjectScoreMapper.covertSubjectScoreVOList(subjectScoreDTOList)));
    }

    private void checkTotalStudent(SubjectScoreDTO subjectScoreDTOList, StudentEntranceTestEntity studentEntranceTestEntity) {
        Integer totalSubjectScore = 0;
        for (Integer scoreDTO : subjectScoreDTOList.getScoreList()) {
            totalSubjectScore += scoreDTO;
        }
        if (totalSubjectScore <= studentEntranceTestEntity.getCheckTotalScore()) {
            throw new BadRequestException(TOTAL_SCORE_SUBJECT);
        }
    }
}
