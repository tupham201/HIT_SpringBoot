package com.example.ktra.service;

import com.example.ktra.dto.Request.CreateCategoryDTO;
import com.example.ktra.dto.Request.UpdateCategoryDTO;
import com.example.ktra.dto.reponse.CategoryReponseDTO;
import com.example.ktra.repository.CategoryRepository;

import java.util.List;

public interface CategoryService {
    List<CategoryReponseDTO> getAllCategories();
    CategoryReponseDTO createCategory(CreateCategoryDTO createCategoryDTO);
    CategoryReponseDTO updateCategory(UpdateCategoryDTO updateCategoryDTO);
    CategoryReponseDTO findCategoryById(String id);
    void deleteCategory(String id);
}
