package com.example.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventorymanagement.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
