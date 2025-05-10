package com.example.ktra.dto.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.web.JsonPath;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String Desciption;
    private Float price;
    @ManyToOne
    @JoinColumn(name = "Author_id",referencedColumnName = "id")
    private Author author;

    @OneToMany
    @JoinColumn(name = "Category_id",referencedColumnName = "id")
    private List<Category> categories;
}
