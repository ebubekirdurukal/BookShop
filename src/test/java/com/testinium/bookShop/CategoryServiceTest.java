package com.testinium.bookShop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.CategoryRepository;
import com.testinium.bookShop.service.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
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

