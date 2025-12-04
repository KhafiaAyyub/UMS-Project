package com.ums.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One-To-Many (Department → Students)
    @OneToMany(mappedBy = "department")
    @JsonIgnore
    private List<Student> students = new ArrayList<>();
}

//Many students belong to one department
//Department should NOT be deleted if a student is deleted