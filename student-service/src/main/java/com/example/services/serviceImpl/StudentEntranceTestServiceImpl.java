package com.example.services.serviceImpl;


import com.example.entities.StudentEntranceTestEntity;
import com.example.repositories.StudentEntranceTestRepository;
import com.example.services.StudentEntranceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentEntranceTestServiceImpl implements StudentEntranceTestService {

    @Autowired
    StudentEntranceTestRepository studentEntranceTestRepository;
    @Override
    public Optional<StudentEntranceTestEntity> findBySchoolYear(Integer year){
      return   studentEntranceTestRepository.findBySchoolYear(year);
    }

    @Override
    public StudentEntranceTestEntity addStudentEntranceTestEntity(StudentEntranceTestEntity studentEntranceTestEntity)
    {
        return studentEntranceTestRepository.save(studentEntranceTestEntity);
    }

}
