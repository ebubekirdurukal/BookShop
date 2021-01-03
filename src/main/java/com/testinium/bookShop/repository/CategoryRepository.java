package com.testinium.bookShop.repository;

import com.testinium.bookShop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}