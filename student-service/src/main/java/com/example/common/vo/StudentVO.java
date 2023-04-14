package com.example.common.vo;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {
    private Integer numberStudentPass;
    List<Integer> codeSubjectList;
    List<SubjectScoreVO> subjectScoreVOList;

}
