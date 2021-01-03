package com.testinium.bookShop.controller;

import com.testinium.bookShop.dto.CategoryDto;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.CategoryRepository;
import com.testinium.bookShop.service.BookServiceImpl;
import com.testinium.bookShop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/category")
public class CategoryController {


    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createCategory(@RequestBody CategoryDto categoryDto) {
        logger.info("Creating the category");
        Category category=new Category();
        category.setName(categoryDto.getName());
        return ResponseEntity.ok(categoryService.createCategory(categoryDto));
    }

    @GetMapping("/listAllCategories")
    public ResponseEntity<?> listAllCategories() {
        return ResponseEntity.ok(categoryRepository.findAll());

    }
}
