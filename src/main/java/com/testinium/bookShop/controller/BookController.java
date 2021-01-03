package com.testinium.bookShop.controller;


import com.testinium.bookShop.dto.BookDto;
import com.testinium.bookShop.repository.BookRepository;
import com.testinium.bookShop.service.BookService;
import com.testinium.bookShop.service.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/create")
    public ResponseEntity<?> createBook(@RequestBody BookDto bookDto) {
        logger.info("Creating the book");
        return ResponseEntity.ok(bookService.createBook(bookDto));

    }

    @GetMapping("/listAll")
    public ResponseEntity<?> listAllBooks() {
        return ResponseEntity.ok(bookService.listBooks());
    }

    @GetMapping("/findByCategory/{id}")
    public ResponseEntity<?> findBookByCategoryId(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(bookService.listByCategory(id));
    }

    @PutMapping("/updateCategory/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable(value = "id") int id, @RequestBody BookDto bookDto) {
        return ResponseEntity.ok(bookService.updateBookCategory(id,bookDto));

    }


}
