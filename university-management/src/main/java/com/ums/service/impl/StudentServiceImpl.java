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


	@Override
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id: " + id));   
		}	
	
	public Student updateStudent(Long id, Student studentDetails) {
	    Student student = studentRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));

	    // Update fields
	    student.setName(studentDetails.getName());
	    student.setEmail(studentDetails.getEmail());

	    return studentRepository.save(student);
	}


	@Override
	public void deleteStudent(Long id) {
	   Student student = studentRepository.findById(id)
			   .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
	    studentRepository.delete(student);

	}


	@Override
	public Student patchStudent(Long id, Student studentDetails) {
		Student existingStudent = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
		if (studentDetails.getName() != null) {
            existingStudent.setName(studentDetails.getName());
        }
        if (studentDetails.getEmail() != null) {
            existingStudent.setEmail(studentDetails.getEmail());
        }
        if (studentDetails.getCourse() != null) {
            existingStudent.setCourse(studentDetails.getCourse());
        }

        return studentRepository.save(existingStudent);
    }

	}

	

