package com.example.services;

import com.example.entities.StudentEntranceTestEntity;

import java.util.Optional;

public interface StudentEntranceTestService {
    Optional<StudentEntranceTestEntity> findBySchoolYear(Integer year);

    StudentEntranceTestEntity addStudentEntranceTestEntity(StudentEntranceTestEntity studentEntranceTestEntity);
}
