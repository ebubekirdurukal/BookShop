package com.testinium.bookShop.service;

import com.testinium.bookShop.dto.CategoryDto;
import com.testinium.bookShop.model.Category;

import java.util.List;

public interface CategoryService {
     Category createCategory(CategoryDto categoryDto);
     List<Category> listCategories();
}
