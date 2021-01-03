package com.testinium.bookShop.service;

import com.testinium.bookShop.dto.BookDto;
import com.testinium.bookShop.dto.CatalogRegistrationDto;
import com.testinium.bookShop.dto.BookStoreDto;
import com.testinium.bookShop.dto.CategoryDto;
import com.testinium.bookShop.model.Book;
import com.testinium.bookShop.model.BookStore;
import com.testinium.bookShop.model.CatalogRegistration;
import com.testinium.bookShop.model.Category;
import com.testinium.bookShop.repository.BookRepository;
import com.testinium.bookShop.repository.BookStoreRepository;
import com.testinium.bookShop.repository.CatalogRegistrationRepository;
import com.testinium.bookShop.repository.CategoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements  BookService {

    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CatalogRegistrationRepository catalogRegistrationRepository;

    @Override
    public BookDto createBook(BookDto bookDto) {
        Book book = new Book();
        Category category =categoryRepository.getOne(bookDto.getCategoryId());
        book.setCategory(category);
        book.setName(bookDto.getName());
        book.setPrice(bookDto.getPrice());
        bookRepository.save(book);
        return pojoToDto(book);

    }

    @Override
    public BookDto updateBookCategory(int id,BookDto bookDto) {

        Book book=bookRepository.getOne(id);
        Category category=categoryRepository.getOne(bookDto.getCategoryId());
        book.setCategory(category);
        bookRepository.save(book);
        return bookDto;
    }

    @Override
    public List<BookDto> listBooks() {

        List<BookDto> bookDtos=new ArrayList<>();
        for(Book book:bookRepository.findAll()){
            bookDtos.add(pojoToDto(book));
        }
        return bookDtos;

    }

    @Override
    public List<BookDto> listByCategory(int id) {
        List<BookDto> bookDtos=new ArrayList<>();
        for(Book book:bookRepository.findByCategoryId(id)){
            bookDtos.add(pojoToDto(book));
        }
        return bookDtos;
    }

    private BookDto pojoToDto(Book pojo){
        BookDto bookDto=new BookDto();
        CategoryDto category=new CategoryDto();
        category.setCategoryId(pojo.getCategory().getId());
        category.setName(pojo.getCategory().getName());
        bookDto.setCategoryId(category.getCategoryId());
        bookDto.setPrice(pojo.getPrice());
        bookDto.setName(pojo.getName());
        bookDto.setId(pojo.getId());
        List<CatalogRegistrationDto> catalogRegistrationDtoList=new ArrayList<>();
        for(CatalogRegistration record:pojo.getCatalogRegistrations()){
            BookStoreDto bookStoreDto=new BookStoreDto();
            bookStoreDto.setCity(record.getBookStore().getCity());
            bookStoreDto.setId(record.getBookStore().getId());
            bookStoreDto.setName(record.getBookStore().getName());

            CatalogRegistrationDto catalogRegistrationDto=new CatalogRegistrationDto();
            catalogRegistrationDto.setBookStoreDto(bookStoreDto);
            catalogRegistrationDtoList.add(catalogRegistrationDto);

        }
        bookDto.setCatalogRegistrationDtos(catalogRegistrationDtoList);
        return bookDto;




    }
}
