package com.example.ktra.controller;

import com.example.ktra.base.RestApiV1;
import com.example.ktra.base.VsReponseUtil;
import com.example.ktra.constant.Url;
import com.example.ktra.dto.Request.CreateCategoryDTO;
import com.example.ktra.dto.Request.UpdateCategoryDTO;
import com.example.ktra.dto.entity.Category;
import com.example.ktra.service.CategoryService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestApiV1
@RequestMapping("api/v1/category")
@RequiredArgsConstructor

public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    private ResponseEntity<?> getCategorys() {
        return VsReponseUtil.success(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> getCategory(@RequestParam String id) {
        return VsReponseUtil.success(categoryService.findCategoryById(id));
    }

    @PostMapping
    private ResponseEntity<?> createCategory(@RequestBody CreateCategoryDTO createCategoryDTO) {
        return VsReponseUtil.success(categoryService.createCategory(createCategoryDTO));
    }

    @PutMapping("/{id}")
    private ResponseEntity<?> updateCategory(@RequestBody UpdateCategoryDTO updateCategoryDTO) {
        return VsReponseUtil.success(categoryService.updateCategory(updateCategoryDTO));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deleteCategory(@PathVariable String id) {
        categoryService.deleteCategory(id);
        return null;
    }

}
