package com.andreibono.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreibono.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
