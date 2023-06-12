package com.hexagonal.hexagonal.App.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;
import lombok.Data;

@Data
public class ProductResponse {
    private Integer id;
    private String name;
    private String description;

}
