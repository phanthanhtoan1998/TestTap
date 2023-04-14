package com.example.components;

import com.example.common.dto.IndustryCodeSubjectDTO;
import com.example.common.mappers.IndustryCodeSubjectMapper;
import com.example.common.vo.IndustryCodeSubjectVO;
import com.example.services.IndustryCodeService;
import com.example.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.common.mappers.*;


@Component
public class AddIndustryCodeComponent {
    @Autowired
    private IndustryCodeService industryCodeService;
    @Autowired
    private SubjectService subjectService;

    public ResponseEntity<IndustryCodeSubjectVO> addIndustryCodeAndSubject(IndustryCodeSubjectDTO industryCodeSubjectDTO) {
        var industryCodeEntity = industryCodeService.addIndustryCode(IndustryCodeSubjectMapper.covertIndustryCodeEntity(industryCodeSubjectDTO));
        var subjectEntityList = subjectService.addSubjectEntityList(SubjectMapper.convertStudentEntityList(industryCodeEntity.getId(), industryCodeSubjectDTO.getSubjectDTOList()));
        var studentVOList = SubjectMapper.convertStudentVOList(subjectEntityList);
        return ResponseEntity.ok().body(IndustryCodeSubjectMapper.covertIndustryCodeVO(industryCodeEntity, studentVOList));

    }

}
