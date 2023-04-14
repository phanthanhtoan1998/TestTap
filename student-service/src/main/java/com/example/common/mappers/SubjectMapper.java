package com.example.common.mappers;

import com.example.common.dto.SubjectDTO;
import com.example.common.vo.SubjectVO;
import com.example.entities.SubjectEntity;

import java.util.ArrayList;
import java.util.List;

public class SubjectMapper {
    public static List<SubjectEntity> convertStudentEntityList(Integer idIndustryCodeEntity, List<SubjectDTO> subjectDTOList) {
        List<SubjectEntity> subjectEntities = new ArrayList<>();
        for (SubjectDTO sub : subjectDTOList) {
            subjectEntities.add(convertStudentEntity(idIndustryCodeEntity, sub));
        }
        return subjectEntities;
    }

    private static SubjectEntity convertStudentEntity(Integer idIndustryCodeEntity, SubjectDTO subjectDTO) {
        return SubjectEntity.builder().codeSubject(subjectDTO.getCodeSubject()).idIndustryCode(idIndustryCodeEntity).build();
    }

    public static List<SubjectVO> convertStudentVOList(List<SubjectEntity> subjectEntityList) {
        List<SubjectVO> subjectVOS = new ArrayList<>();
        for (SubjectEntity sub : subjectEntityList) {
            subjectVOS.add(convertStudentVO(sub));
        }
        return subjectVOS;
    }

    private static SubjectVO convertStudentVO(SubjectEntity subjectEntity) {
        return SubjectVO.builder().codeSubject(subjectEntity.getCodeSubject()).build();
    }
}
