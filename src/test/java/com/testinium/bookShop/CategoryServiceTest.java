package com.testinium.bookShop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.testinium.bookShop.controller.BookController;
import com.testinium.bookShop.controller.CategoryController;
import com.testinium.bookShop.dto.BookDto;
import com.testinium.bookShop.dto.CategoryDto;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.BookRepository;
import com.testinium.bookShop.repository.CategoryRepository;
import com.testinium.bookShop.service.BookService;
import com.testinium.bookShop.service.CategoryService;
import com.testinium.bookShop.service.CategoryServiceImpl;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @InjectMocks
    private CategoryServiceImpl categoryService;

    @Mock
    private CategoryRepository categoryRepository;

    @Test
    public void createdCategoryShouldBeListed() throws Exception {

        Category category = new Category();
        category.setId(1);
        category.setName("Test Category");
        when(categoryRepository.findAll()).thenReturn(Collections.singletonList(category));
        List<Category> categories = categoryService.listCategories();
        assertEquals(categories.size(),1);



    }
}

