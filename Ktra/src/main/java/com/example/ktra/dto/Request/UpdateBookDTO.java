package com.example.ktra.dto.Request;

import com.example.ktra.dto.entity.Author;
import com.example.ktra.dto.entity.Category;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UpdateBookDTO {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotNull
    private String Desciption;
    @NotNull
    private Float price;
    @NotNull
    private Author author;
    @NotNull
    private List<Category> categories;
}
