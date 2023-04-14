package com.example.services.serviceImpl;


import com.example.entities.IndustryCodeEntity;
import com.example.repositories.IndustryRepository;
import com.example.services.IndustryCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustryCodeServiceImpl implements IndustryCodeService {
    @Autowired
    IndustryRepository industryRepository;

    @Override
    public List<IndustryCodeEntity> findAll() {
        return industryRepository.findAll();
    }

    @Override
    public IndustryCodeEntity addIndustryCode(IndustryCodeEntity industryCodeEntity) {
        return industryRepository.save(industryCodeEntity);
    }
}
