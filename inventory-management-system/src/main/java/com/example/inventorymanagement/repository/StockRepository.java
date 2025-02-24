package com.example.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventorymanagement.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
