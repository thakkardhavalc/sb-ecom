package com.ecommerce.project.service;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;

/**
 * Author: dhhaval thakkar
 * Date:2024-11-06
 */

public interface ProductService {

    ProductDTO addProduct(Long categoryId, Product product);
}
