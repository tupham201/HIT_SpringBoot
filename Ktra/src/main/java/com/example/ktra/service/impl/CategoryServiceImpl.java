package com.example.ktra.service.impl;

import com.example.ktra.constant.ErrorMessage;
import com.example.ktra.dto.Request.CreateCategoryDTO;
import com.example.ktra.dto.Request.UpdateCategoryDTO;
import com.example.ktra.dto.entity.Book;
import com.example.ktra.dto.entity.Category;
import com.example.ktra.dto.mapper.CategoryMapper;
import com.example.ktra.dto.reponse.CategoryReponseDTO;
import com.example.ktra.exception.NotFoundException;
import com.example.ktra.repository.CategoryRepository;
import com.example.ktra.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryReponseDTO> getAllCategories() {
        return categoryMapper.toCategoryReponseDTOList(categoryRepository.findAll());
    }

    @Override
    public CategoryReponseDTO createCategory(CreateCategoryDTO createCategoryDTO) {
        Category category = categoryMapper.toCategory(createCategoryDTO);
        Category savecategory = categoryRepository.save(category);
        return categoryMapper.toCategoryReponseDTO(savecategory);
    }

    @Override
    public CategoryReponseDTO updateCategory(UpdateCategoryDTO updateCategoryDTO) {
        Category category = categoryRepository.findById(updateCategoryDTO.getId()).orElseThrow(() -> new NotFoundException(ErrorMessage.Category.CATEGORY_NOT_FOUND,new String[]{updateCategoryDTO.getId()}));
        Category savecategory = categoryRepository.save(category);
        return categoryMapper.toCategoryReponseDTO(savecategory);
    }

    @Override
    public CategoryReponseDTO findCategoryById(String id) {
        Category category = categoryRepository.findById(id).orElseThrow(() -> new NotFoundException(ErrorMessage.Category.CATEGORY_NOT_FOUND,new String[]{id}));
        return categoryMapper.toCategoryReponseDTO(category);
    }


    @Override
    public void deleteCategory(String id) {
        if (categoryRepository.existsById(id)) {
            throw new NotFoundException(ErrorMessage.Category.CATEGORY_NOT_FOUND,new String[]{id});
        }
        categoryRepository.deleteById(id);
    }
}
