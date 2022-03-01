package com.alejanicki.course.repositories;

import com.alejanicki.course.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}