package com.example.demo.repository;

import com.example.demo.entity.data.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District, Integer> {
    List<District> findAllByStateId(Integer id);
}
