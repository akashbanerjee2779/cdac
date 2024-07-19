package com.example.demo.repository;

import com.example.demo.entity.data.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
