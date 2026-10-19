package com.portfolio.inventory_backend.repository;

import com.portfolio.inventory_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Spring Data JPA automatically provides findAll(), save(), findById(), and deleteById() out of the box!
}