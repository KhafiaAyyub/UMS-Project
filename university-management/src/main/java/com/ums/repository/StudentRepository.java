package com.ums.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	List<Student> findByNameContainingIgnoreCase(String name);

	
	
}
