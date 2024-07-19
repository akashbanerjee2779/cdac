package com.example.demo.repository;

import com.example.demo.entity.data.SuperCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperCategoryRepository extends JpaRepository<SuperCategory, Long> {
}
