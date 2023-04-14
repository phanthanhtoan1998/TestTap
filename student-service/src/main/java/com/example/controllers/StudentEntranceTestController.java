package com.example.controllers;

import com.example.common.dto.StudentEntranceTestDTO;
import com.example.common.vo.StudentEntranceTestVO;
import com.example.components.AddStudentEntranceTestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentEntranceTestController {
    @Autowired
    private AddStudentEntranceTestComponent addStudentEntranceTestComponent;
    @PostMapping("/addStudentEntranceTest")
    public ResponseEntity<StudentEntranceTestVO> addStudentEntranceTest(@RequestBody StudentEntranceTestDTO studentEntranceTestDTO)
    {
       return addStudentEntranceTestComponent.addStudentEntranceTest(studentEntranceTestDTO);
    }
}
