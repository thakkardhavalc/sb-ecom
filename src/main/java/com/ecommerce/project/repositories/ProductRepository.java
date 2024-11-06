package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: dhhaval thakkar
 * Date:2024-11-06
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
