package com.example.repositories;

import com.example.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer> {
    List<SubjectEntity> findAllByIdIndustryCodeIn(List<Integer> idIndustryCode);
}
