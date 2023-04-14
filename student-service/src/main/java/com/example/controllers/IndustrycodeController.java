package com.example.controllers;


import com.example.common.dto.IndustryCodeSubjectDTO;
import com.example.common.vo.IndustryCodeSubjectVO;
import com.example.components.AddIndustryCodeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndustrycodeController {

    @Autowired
    private AddIndustryCodeComponent addIndustryCodeComponent;

    @PostMapping("/addIndustryCodeAndSubject")
    public ResponseEntity<IndustryCodeSubjectVO> addIndustryCodeAndSubject(@RequestBody IndustryCodeSubjectDTO studentEntranceTestDTO) {
        return addIndustryCodeComponent.addIndustryCodeAndSubject(studentEntranceTestDTO);
    }

}
