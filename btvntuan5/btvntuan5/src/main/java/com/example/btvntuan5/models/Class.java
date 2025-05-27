package com.example.btvntuan5.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Class",nullable = false)
    private String className;
    @Column(name = "Subject",nullable = false)
    private String subject;

    @OneToMany(mappedBy = "clazz",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Student> students;
}
