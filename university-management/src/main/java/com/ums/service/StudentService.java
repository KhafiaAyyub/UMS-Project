package com.ums.service;

import java.util.List;

import com.ums.entity.Student;

public interface StudentService {
	
    Student createStudent(Student student); //create
	List<Student> getAllStudents(); //show
    Student getStudentById(Long id); //show by id
    Student updateStudent(Long id, Student studentDetails);
    void deleteStudent(Long id);
    Student patchStudent(Long id, Student studentDetails);
    List<Student> searchStudentsByName(String name);
	Student assignDepartment(Long studentId, Long deptId);

	
	

}
