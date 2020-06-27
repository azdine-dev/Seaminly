package com.azdine.dev.controller;

import com.azdine.dev.entities.Student;
import com.azdine.dev.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "/seaminly/v1")

public class SeaminlyController {

    @Autowired
    private StudentRepository strudentRepository;

    @PostMapping(path = "/add")
    public ResponseEntity<Student> addNewStudent(@RequestBody @Valid Student std){


       Student student = new Student();

       student.setFirstName(std.getFirstName());
       student.setLastName(std.getLastName());
       student.setDateNaissance(std.getDateNaissance());

       return ResponseEntity.ok(student);
    }
}
