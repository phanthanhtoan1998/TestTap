package com.example.repositories;

import com.example.entities.StudentEntranceTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentEntranceTestRepository extends JpaRepository<StudentEntranceTestEntity,Integer> {
     Optional<StudentEntranceTestEntity> findBySchoolYear(Integer year);
}
