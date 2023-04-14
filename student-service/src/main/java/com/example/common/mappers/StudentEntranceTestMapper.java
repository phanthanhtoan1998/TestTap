package com.example.common.mappers;

import com.example.common.dto.StudentEntranceTestDTO;
import com.example.common.vo.StudentEntranceTestVO;
import com.example.entities.StudentEntranceTestEntity;


public class StudentEntranceTestMapper {
    public static StudentEntranceTestEntity covertStudentEntranceTestEntity(StudentEntranceTestDTO studentEntranceTestDTO) {
        return StudentEntranceTestEntity.builder().schoolYear(studentEntranceTestDTO.getSchoolYear()).checkTotalScore(studentEntranceTestDTO.getCheckTotalScore()).build();
    }

    public static StudentEntranceTestVO covertStudentEntranceTestVO(StudentEntranceTestEntity studentEntranceTestEntity) {
        return StudentEntranceTestVO.builder().schoolYear(studentEntranceTestEntity.getSchoolYear()).checkTotalScore(studentEntranceTestEntity.getCheckTotalScore()).build();
    }
}
