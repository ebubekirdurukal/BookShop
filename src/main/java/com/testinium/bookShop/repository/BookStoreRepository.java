package com.testinium.bookShop.repository;

import com.testinium.bookShop.model.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("bookStoreRepository")
public interface BookStoreRepository extends JpaRepository<BookStore, Integer> {
}