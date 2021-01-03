package com.testinium.bookShop.service;


import com.testinium.bookShop.dto.CategoryDto;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public  Category createCategory(CategoryDto categoryDto) {

        Category category=new Category();
        category.setName(categoryDto.getName());
        categoryRepository.save(category);
        logger.info(category.getName()+" is created successfully");
        return category;
    }

    @Override
    public List<Category> listCategories(){
        return categoryRepository.findAll();
    }
}
