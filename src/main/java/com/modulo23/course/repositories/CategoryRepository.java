package com.modulo23.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modulo23.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
