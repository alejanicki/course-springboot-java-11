package com.alejanicki.course.repositories;

import com.alejanicki.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}