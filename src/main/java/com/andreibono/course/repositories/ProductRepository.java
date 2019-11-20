package com.andreibono.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreibono.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
