package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name",length = 100, nullable = false)
    private String name;
    @Column(name = "Email",length = 150,unique = true,nullable = false)
    private String email;
    @Column(name = "Phone",length = 15, unique = true,nullable = false)
    private String phone;
    private String address;
}
