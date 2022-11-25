package com.modulo23.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modulo23.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
