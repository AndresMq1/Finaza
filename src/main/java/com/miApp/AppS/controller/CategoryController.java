package com.miApp.AppS.controller;

import com.miApp.AppS.dto.CategoryDTO;
import com.miApp.AppS.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/cate")
public class CategoryController {


    private final CategoryService  categoryService;
    public CategoryController(CategoryService categoryService ) {
        this.categoryService = categoryService;
        }

    @RequestMapping("/listar")
    public ResponseEntity<List<CategoryDTO>>  getAllCategories() {
        List<CategoryDTO> categories = categoryService.getAllCategory();
        return  ResponseEntity.ok(categories);
    }

    @RequestMapping("/id/{idCategory}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Long idCategory) {
        CategoryDTO category = categoryService.getCategoryById(idCategory);
        return ResponseEntity.ok(category);
    }

    @PostMapping("/crear")
    public ResponseEntity<CategoryDTO> createCategory(@Validated @RequestBody CategoryDTO categoryDTO) {
        categoryService.createCategory(categoryDTO);
        return ResponseEntity.ok(categoryDTO);
    }


    @DeleteMapping("/eliminar/{idCategory}")
    public ResponseEntity<Long> deleteCategory(@PathVariable Long idCategory) {
        categoryService.deleteCategory(idCategory);
        return ResponseEntity.ok(idCategory);
    }

    @PutMapping("/actualizar/{idCategory}")
    public ResponseEntity<CategoryDTO>  updateCategory(@PathVariable Long idCategory, @Validated @RequestBody CategoryDTO categoryDTO) {
        CategoryDTO cate = categoryService.updateCategory(idCategory,categoryDTO);
        return ResponseEntity.ok(cate);
    }



}
