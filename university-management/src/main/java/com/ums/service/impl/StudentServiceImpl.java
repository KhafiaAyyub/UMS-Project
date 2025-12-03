package com.ums.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.entity.Department;
import com.ums.entity.Student;
import com.ums.repository.DepartmentRepository;
import com.ums.repository.StudentRepository;
import com.ums.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	private final StudentRepository studentRepository;
	@Autowired
	private DepartmentRepository departmentRepository;

	
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
        if (studentDetails.getCourses() != null) {
            existingStudent.setCourses(studentDetails.getCourses());
        }

        return studentRepository.save(existingStudent);
    }


	@Override
	public List<Student> searchStudentsByName(String name) {
		return studentRepository.findByNameContainingIgnoreCase(name);
	}


	public Student assignDepartment(Long studentId, Long deptId) {
		Student student = studentRepository.findById(studentId)
	            .orElseThrow(() -> new RuntimeException("Student not found"));

	    Department department = departmentRepository.findById(deptId)
	            .orElseThrow(() -> new RuntimeException("Department not found"));

	    student.setDepartment(department);

	    return studentRepository.save(student);
	}

	}

	

