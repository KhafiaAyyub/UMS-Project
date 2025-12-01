package com.ums.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ums.entity.Student;
import com.ums.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService studentService;
	
	 @GetMapping
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }
	
	
	
	

}
