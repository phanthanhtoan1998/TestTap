package com.example.services.serviceImpl;


import com.example.entities.SubjectEntity;
import com.example.repositories.SubjectRepository;
import com.example.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectRepository subjectRepository;


    @Override
    public List<SubjectEntity> findAllByIndustryCode(List<Integer> idIndustryCode) {
        return subjectRepository.findAllByIdIndustryCodeIn(idIndustryCode);
    }

    @Override
    public List<SubjectEntity> addSubjectEntityList(List<SubjectEntity> subjectEntityList) {
        return subjectRepository.saveAll(subjectEntityList);
    }
}
