package com.andreibono.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreibono.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
