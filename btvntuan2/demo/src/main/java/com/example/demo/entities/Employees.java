package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table (name = "Nhanvien")
public class Employees {
    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 40)
    private String name;
    @Column(name = "email",length = 60)
    private String email;
    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "phone", length = 10)
    private String phone;

}
