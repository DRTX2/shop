package com.drtx.demo.core.ports.out.catalog;

import com.drtx.demo.core.model.catalog.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepositoryPort {
    Category save(Category category);
    Category update(Category category);
    Optional<Category> findById(Long id);
    List<Category> findAll();
    void deleteById(Long categoryId);
}