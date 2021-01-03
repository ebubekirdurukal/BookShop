package com.testinium.bookShop;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.testinium.bookShop.controller.BookController;
import com.testinium.bookShop.dto.BookDto;
import com.testinium.bookShop.model.Book;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.BookRepository;
import com.testinium.bookShop.service.BookService;
import com.testinium.bookShop.service.BookServiceImpl;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {



    @InjectMocks
    private BookServiceImpl bookService;

    @Mock
    private BookRepository bookRepository;

    @Test
    public void createdBookShouldBeListed() throws Exception {
        Category category = new Category();
        category.setId(1);
        category.setName("Test Category");
        Book book = new Book();
        book.setId(1);
        book.setName("Test Book");
        book.setPrice(5);
        book.setCategory(category);
        when(bookRepository.findAll()).thenReturn(Collections.singletonList(book));
        List<BookDto> books = bookService.listBooks();
        assertEquals(books.size(),1);

    }
}

