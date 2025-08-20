package com.miApp.AppS.Impl;

import com.miApp.AppS.dto.CategoryDTO;
import com.miApp.AppS.repository.CategoryRepository;
import com.miApp.AppS.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    public CategoryServiceImpl() {
        this.categoryRepository = null; // This is not a good practice, but included to match the constructor signature.
    }

    @Override
    public CategoryDTO findAllCategories() {
        return null;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO getCategoryById(Long categoryId) {
        return null;
    }

    @Override
    public CategoryDTO updateCategory(Long categoryId, CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public void deleteCategory(Long categoryId) {

    }
}
