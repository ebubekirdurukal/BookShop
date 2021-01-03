package com.testinium.bookShop.controller;

import com.testinium.bookShop.dto.BookStoreDto;
import com.testinium.bookShop.dto.CatalogRegistrationDto;
import com.testinium.bookShop.repository.BookStoreRepository;
import com.testinium.bookShop.service.BookServiceImpl;
import com.testinium.bookShop.service.BookStoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bookStore")
public class BookStoreController {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookStoreService bookStoreService;

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createBookStore(@RequestBody BookStoreDto bookStoreDto) {
        logger.info("Creating the Bookstore");
        return ResponseEntity.ok(bookStoreService.createBookStore(bookStoreDto));
    }

    @GetMapping("/listAllBookStores")
    public ResponseEntity<?> listAllBookStores() {
        return ResponseEntity.ok(bookStoreService.listBookStores());
    }

    @PostMapping("/addBook")
    public ResponseEntity<?> addBookToBookStore(@RequestBody CatalogRegistrationDto catalogRegistrationDto) {
        return ResponseEntity.ok(bookStoreService.addBookToBookStore(catalogRegistrationDto));
    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity deleteBookFromBookStore(@PathVariable(value = "id") int id) {
        bookStoreService.deleteBookFromStore(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}