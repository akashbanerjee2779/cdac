package com.example.demo.repository;

import com.example.demo.entity.data.Market;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<Market, Long> {
}
