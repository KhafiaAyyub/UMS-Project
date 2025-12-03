package com.ums.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    // Many-To-Many (Course ↔ Students)
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();
}

//One student can enroll in many courses
//One course can be taken by many students