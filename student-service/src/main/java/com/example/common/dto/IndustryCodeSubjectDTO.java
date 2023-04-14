package com.example.common.dto;

import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IndustryCodeSubjectDTO {
    private String nameIndustryCode;
    private Integer totalIndustryCodeScore;
    private List<SubjectDTO> subjectDTOList;
}
