package com.example.common.mappers;

import com.example.common.dto.IndustryCodeSubjectDTO;
import com.example.common.vo.IndustryCodeSubjectVO;
import com.example.common.vo.SubjectVO;
import com.example.entities.IndustryCodeEntity;

import java.util.List;

public class IndustryCodeSubjectMapper {
    public static IndustryCodeEntity covertIndustryCodeEntity(IndustryCodeSubjectDTO industryCodeSubjectDTO) {
        return IndustryCodeEntity.builder().nameIndustry(industryCodeSubjectDTO.getNameIndustryCode()).totalIndustryCodeScore(industryCodeSubjectDTO.getTotalIndustryCodeScore()).build();
    }

    public static IndustryCodeSubjectVO covertIndustryCodeVO(IndustryCodeEntity industryCodeEntity, List<SubjectVO> subjectVOList) {
        return IndustryCodeSubjectVO.builder().nameIndustryCode(industryCodeEntity.getNameIndustry()).totalIndustryCodeScore(industryCodeEntity.getTotalIndustryCodeScore()).subjectDTOList(subjectVOList).build();
    }
}
