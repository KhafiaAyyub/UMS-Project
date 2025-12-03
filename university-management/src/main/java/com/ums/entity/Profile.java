package com.ums.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;

    private String address;

    private String gender;

    private String dob; // yyyy-mm-dd format

    @OneToOne(mappedBy = "profile")
    private Student student;
}
