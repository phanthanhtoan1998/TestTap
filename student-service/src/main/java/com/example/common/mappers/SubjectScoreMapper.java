package com.example.common.mappers;

import com.example.common.dto.SubjectScoreDTO;
import com.example.common.vo.SubjectScoreVO;

import java.util.ArrayList;
import java.util.List;

public class SubjectScoreMapper {
    public static List<SubjectScoreVO> covertSubjectScoreVOList(List<SubjectScoreDTO> subjectScoreDTOList) {
        List<SubjectScoreVO> subjectScoreVOList = new ArrayList<>();

        for (SubjectScoreDTO dto : subjectScoreDTOList) {
            subjectScoreVOList.add(convertSubjectScoreVO(dto));
        }
        return subjectScoreVOList;
    }


    private static SubjectScoreVO convertSubjectScoreVO(SubjectScoreDTO subjectScoreDTO) {
        return SubjectScoreVO.builder().scoreList(subjectScoreDTO.getScoreList()).nameIndustry(subjectScoreDTO.getNameIndustry()).build();
    }

}
