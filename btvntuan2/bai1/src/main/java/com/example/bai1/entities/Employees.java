package com.example.bai1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Nhanvien")
public class Employees {
    @Id
    @Column(name = "id", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name" , length = 40)
    private String name ;
    @Column(name = "email" , length = 60)
    private String email ;
    @Column(name = "address",length = 100)
    private String address ;
    @Column(name = "phone" , length = 12)
    private String phone ;

}
