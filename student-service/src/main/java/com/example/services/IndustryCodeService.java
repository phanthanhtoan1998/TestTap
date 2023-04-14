package com.example.services;

import com.example.entities.IndustryCodeEntity;

import java.util.List;

public interface IndustryCodeService {

    List<IndustryCodeEntity> findAll();

    IndustryCodeEntity addIndustryCode(IndustryCodeEntity industryCodeEntity);
}
