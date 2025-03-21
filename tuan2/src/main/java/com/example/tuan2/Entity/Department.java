package com.example.tuan2.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="department")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    public Department(String name) {
        this.name = name;
    }
}
