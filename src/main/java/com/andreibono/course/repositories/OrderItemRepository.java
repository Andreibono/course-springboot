package com.andreibono.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreibono.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
