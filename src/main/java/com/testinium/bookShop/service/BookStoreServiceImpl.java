package com.testinium.bookShop.service;


import com.testinium.bookShop.dto.BookStoreDto;
import com.testinium.bookShop.dto.CatalogRegistrationDto;
import com.testinium.bookShop.model.Book;
import com.testinium.bookShop.model.BookStore;
import com.testinium.bookShop.model.CatalogRegistration;
import com.testinium.bookShop.repository.BookRepository;
import com.testinium.bookShop.repository.BookStoreRepository;
import com.testinium.bookShop.repository.CatalogRegistrationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookStoreService")
public class BookStoreServiceImpl implements BookStoreService {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CatalogRegistrationRepository catalogRegistrationRepository;

    @Override
    public BookStoreDto createBookStore(BookStoreDto bookStoreDto) {

        BookStore bookStore=new BookStore();
        bookStore.setCity(bookStoreDto.getCity());
        bookStore.setName(bookStoreDto.getName());
        bookStoreRepository.save(bookStore);
        logger.info(bookStore.getName()+" is created successfully");
        return bookStoreDto;

    }

    @Override
    public List<BookStore> listBookStores() {
        return bookStoreRepository.findAll();
    }

    @Override
    public CatalogRegistrationDto addBookToBookStore(CatalogRegistrationDto catalogRegistrationDto) {
        CatalogRegistration catalogRegistration=new CatalogRegistration();
        Book book=bookRepository.getOne(catalogRegistrationDto.getBookId());
        BookStore bookStore=bookStoreRepository.getOne(catalogRegistrationDto.getBookStoreId());
        catalogRegistration.setBook(book);
        catalogRegistration.setBookStore(bookStore);
        catalogRegistrationRepository.save(catalogRegistration);
        return catalogRegistrationDto;


    }

    @Override
    public void deleteBookFromStore(int id) {
            catalogRegistrationRepository.deleteById(id);
    }


}
