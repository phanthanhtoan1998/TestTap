package com.example.common.vo;

import com.example.common.dto.SubjectDTO;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IndustryCodeSubjectVO {
    private String nameIndustryCode;
    private Integer totalIndustryCodeScore;
    private List<SubjectVO> subjectDTOList;
}
