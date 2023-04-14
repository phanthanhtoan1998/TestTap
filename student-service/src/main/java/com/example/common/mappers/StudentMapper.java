package com.example.common.mappers;

import com.example.common.vo.StudentVO;
import com.example.common.vo.SubjectScoreVO;

import java.util.List;

public class StudentMapper {

    public static StudentVO convertStudentVO(Integer numberStudentPass, List<Integer> codeSubjectList, List<SubjectScoreVO> subjectScoreVOList) {
        return StudentVO.builder().numberStudentPass(numberStudentPass).codeSubjectList(codeSubjectList).subjectScoreVOList(subjectScoreVOList).build();
    }
}
