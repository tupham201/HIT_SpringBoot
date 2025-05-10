package com.example.ktra.dto.mapper;

import com.example.ktra.dto.Request.CreateCategoryDTO;
import com.example.ktra.dto.Request.UpdateCategoryDTO;
import com.example.ktra.dto.entity.Category;
import com.example.ktra.dto.reponse.CategoryReponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    Category toCategory(CreateCategoryDTO createCategoryDTO);
    Category updateCategory(UpdateCategoryDTO updateCategoryDTO);
    CategoryReponseDTO toCategoryReponseDTO(Category category);
    List<CategoryReponseDTO> toCategoryReponseDTOList(List<Category> categoryList);
}
