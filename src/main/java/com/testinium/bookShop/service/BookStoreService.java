package com.testinium.bookShop.service;

import com.testinium.bookShop.dto.BookStoreDto;
import com.testinium.bookShop.dto.CatalogRegistrationDto;
import com.testinium.bookShop.model.Book;
import com.testinium.bookShop.model.BookStore;
import com.testinium.bookShop.model.CatalogRegistration;

import java.util.List;

public interface BookStoreService {
    BookStoreDto createBookStore(BookStoreDto bookStoreDto);
    List<BookStore> listBookStores();
    CatalogRegistrationDto addBookToBookStore(CatalogRegistrationDto catalogRegistrationDto);
    void deleteBookFromStore(int id);
}
