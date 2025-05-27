package com.example.btvntuan5.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name",nullable = false)
    private String name;
    @Column(name = "Date",nullable = false)
    private Date date;
    @Column(name = "Gender",nullable = false)
    private Gender gender;
    @Column(name = "Email",nullable = false,unique = true)
    private String email;
    @Column(name = "Phone",nullable = false, unique = true)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "class_id",nullable = false)
    private Class clazz;
}
