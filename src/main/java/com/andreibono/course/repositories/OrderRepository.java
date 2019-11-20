package com.andreibono.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreibono.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
