package com.ums.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	List<Student> findByNameContainingIgnoreCase(String name);

	Optional<Student> findByEmail(String email);
    List<Student> findByDepartmentId(Long departmentId);
    List<Student> findByAgeBetween(int start, int end);
	
}
