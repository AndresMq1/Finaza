package com.miApp.AppS.service;

import com.miApp.AppS.dto.CategoryDTO;

public interface CategoryService {

    CategoryDTO findAllCategories();

    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategoryById(Long categoryId);
    CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO);
    void deleteCategory(Long categoryId);

}
