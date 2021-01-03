package com.testinium.bookShop.repository;

import com.testinium.bookShop.model.Book;
import com.testinium.bookShop.model.CatalogRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("catalogRegistrationRepository")
public interface CatalogRegistrationRepository extends JpaRepository<CatalogRegistration, Integer> {
}
