package com.drtx.demo.core.ports.in.catalog;

import com.drtx.demo.core.model.catalog.Category;

import java.util.List;

public interface CategoryServicePort {
    Category createCategory(Category category);

    Category editCategory(Category category);

    Category findCategoryById(Long id);

    List<Category> fetchAllCategories();// en el front creo que podria ordenarlas por las mas usadas

    void deleteCategory(Long categoryId);
}
