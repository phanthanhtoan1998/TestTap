package com.example.services;

import com.example.entities.SubjectEntity;

import java.util.List;

public interface SubjectService {
    List<SubjectEntity> findAllByIndustryCode(List<Integer> idIndustryCode);
    List<SubjectEntity> addSubjectEntityList(List<SubjectEntity> subjectEntityList);
}
