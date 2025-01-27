package com.turkcell.mini_e_commere_hw2.service.application;

import com.turkcell.mini_e_commere_hw2.dto.category.CategoryListingDto;
import com.turkcell.mini_e_commere_hw2.dto.category.CreateCategoryDto;
import com.turkcell.mini_e_commere_hw2.dto.category.UpdateCategoryDto;
import com.turkcell.mini_e_commere_hw2.entity.Category;

import java.util.List;

public interface CategoryApplicationService {
    void add(CreateCategoryDto createCategoryDto);
    void update(UpdateCategoryDto updateCategoryDto);
    void delete(Integer id);
    List<CategoryListingDto> getAll();
    CategoryListingDto getById(Integer id);
    void addSubCategory(Integer parentId, CreateCategoryDto createCategoryDto);
    List<CategoryListingDto> getAllSubCategories(Integer parentId);
    List<CategoryListingDto> getCategoryTree();
}
