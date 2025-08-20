package com.miApp.AppS.repository;

import com.miApp.AppS.entity.Category;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional <Category> findById(Long id);
    boolean existsByName(String name);

    void deleteById(Long id);
    void deleteByName(String name);

}
