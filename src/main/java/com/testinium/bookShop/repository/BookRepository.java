package com.testinium.bookShop.repository;

import com.testinium.bookShop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByCategoryId(int categoryId);
}

