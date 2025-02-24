package com.example.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventorymanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
