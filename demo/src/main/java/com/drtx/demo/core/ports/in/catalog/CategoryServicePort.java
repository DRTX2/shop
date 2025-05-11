package com.drtx.demo.core.ports.in.catalog;

import com.drtx.demo.core.model.catalog.Category;

public interface CategoryServicePort {
   Category createCategory(Category category);
   Category editCategory(Category category);
   Category fetchAllCategories();// en el front creo que podria ordenarlas por las mas usadas
   void deleteCategory(Long categoryId);
}
