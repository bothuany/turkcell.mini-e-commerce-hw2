package com.turkcell.mini_e_commere_hw2.service.domain;

import com.turkcell.mini_e_commere_hw2.entity.Category;
import java.util.List;

public interface CategoryService {
    void add(Category category);
    void update(Category category);
    void delete(Integer id);
    List<Category> getAll();
    Category getByIdWithDetails(Integer id);
    Category getById(Integer id);
    void addSubCategory(Integer parentId, Category subCategory);
    List<Category> getAllSubCategories(Integer parentId);
}
