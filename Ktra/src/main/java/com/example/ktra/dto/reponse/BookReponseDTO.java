package com.example.ktra.dto.reponse;

import com.example.ktra.dto.entity.Author;
import com.example.ktra.dto.entity.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BookReponseDTO {
    private String id;
    private String name;
    private String Desciption;
    private Float price;
    private Author author;
    private List<Category> categories;
}
