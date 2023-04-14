package com.example.controllers;

import com.example.common.dto.StudentDTO;
import com.example.common.vo.StudentVO;
import com.example.components.CheckStudentComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private CheckStudentComponent checkStudentComponent;

    @GetMapping("/checkStudent")
    public ResponseEntity<StudentVO> checkStudent(@RequestBody StudentDTO studentDTO) {

        return checkStudentComponent.checkStudent(studentDTO);
    }
}
