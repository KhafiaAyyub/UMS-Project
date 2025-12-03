package com.ums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    boolean existsByName(String name);

}
