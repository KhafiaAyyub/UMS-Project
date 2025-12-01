package com.ums.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ums.entity.Student;
import com.ums.repository.StudentRepository;
import com.ums.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	private final StudentRepository studentRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}

	
	
	
	
}
