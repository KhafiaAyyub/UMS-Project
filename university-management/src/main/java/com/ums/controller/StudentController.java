package com.ums.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ums.entity.Student;
import com.ums.service.StudentService;

import jakarta.validation.Valid;
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

	//	 @PostMapping
	//	    public Student save(@RequestBody Student student) {
	//	        return studentService.createStudent(student);
	//	    }

	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@PostMapping
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
		Student savedStudent = studentService.createStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(
			@PathVariable Long id,
			@Valid @RequestBody Student studentDetails) {

		Student updatedStudent = studentService.updateStudent(id, studentDetails);
		return ResponseEntity.ok(updatedStudent);
	}

	//http://localhost:8080/api/students/1
	//DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return ResponseEntity.ok("Student deleted successfully with ID: " + id);
	}

	//http://localhost:8080/api/students/1
	//PATCH
	@PatchMapping("/{id}")
	public ResponseEntity<Student> patchStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
		 Student updatedStudent = studentService.patchStudent(id, studentDetails);
	        return ResponseEntity.ok(updatedStudent);
	}
	
	//serachStudents
	@GetMapping("/search")
	public ResponseEntity<List<Student>> searchStudents(@RequestParam("name") String name) {
		List<Student> students = studentService.searchStudentsByName(name);
	    return ResponseEntity.ok(students);
	}
}
