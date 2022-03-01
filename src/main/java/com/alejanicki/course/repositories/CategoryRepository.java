package com.alejanicki.course.repositories;

import com.alejanicki.course.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}