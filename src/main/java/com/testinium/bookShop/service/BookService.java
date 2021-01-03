package com.testinium.bookShop.service;

import com.testinium.bookShop.dto.BookDto;
import com.testinium.bookShop.model.Book;
import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    BookDto updateBookCategory(int id,BookDto bookDto);
    List<BookDto> listBooks();
    List<BookDto> listByCategory(int id);
}
