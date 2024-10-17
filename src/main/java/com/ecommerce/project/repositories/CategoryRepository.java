package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: dhhaval thakkar
 * Date:2024-10-17
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
