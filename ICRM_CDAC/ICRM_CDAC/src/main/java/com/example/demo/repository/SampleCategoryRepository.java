package com.example.demo.repository;

import com.example.demo.entity.data.SampleCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleCategoryRepository extends JpaRepository<SampleCategory, Integer> {
}
