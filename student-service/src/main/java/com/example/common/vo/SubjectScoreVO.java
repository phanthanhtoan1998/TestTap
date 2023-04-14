package com.example.common.vo;

import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubjectScoreVO {

    private String nameIndustry;

    private List<Integer> scoreList;
}
