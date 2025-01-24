package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: dhhaval thakkar
 * Date:2024-11-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long productId;
    private String productName;
    private String img;
    private String productDescription;
    private Integer productQuantity;
    private Double productPrice;
    private Double productDiscount;
    private Double specialPrice;
}
