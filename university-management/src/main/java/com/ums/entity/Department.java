package com.ums.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

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

    // 🔥 One-To-Many (Department → Students)
    @OneToMany(mappedBy = "department")
    private List<Student> students = new ArrayList<>();
}
