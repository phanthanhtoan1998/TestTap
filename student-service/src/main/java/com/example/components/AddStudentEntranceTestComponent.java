package com.example.components;

import com.example.common.dto.StudentEntranceTestDTO;
import com.example.common.mappers.StudentEntranceTestMapper;
import com.example.common.vo.StudentEntranceTestVO;
import com.example.commonservice.Exceptions.BadRequestException;
import com.example.services.StudentEntranceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import static com.example.common.contants.StudentEntranceTestContant.CHECK_EXIST_YEAR;

@Component
public class AddStudentEntranceTestComponent {
    @Autowired
    private StudentEntranceTestService studentEntranceTestService;

    public ResponseEntity<StudentEntranceTestVO> addStudentEntranceTest(StudentEntranceTestDTO studentEntranceTestDTO) {
        if (studentEntranceTestService.findBySchoolYear(studentEntranceTestDTO.getSchoolYear()).isPresent()) {
            throw new BadRequestException(CHECK_EXIST_YEAR);
        } else {
            var studentEntranceTestEntity = studentEntranceTestService.addStudentEntranceTestEntity(StudentEntranceTestMapper.covertStudentEntranceTestEntity(studentEntranceTestDTO));
            return ResponseEntity.ok().body(StudentEntranceTestMapper.covertStudentEntranceTestVO(studentEntranceTestEntity));
        }
    }
}
