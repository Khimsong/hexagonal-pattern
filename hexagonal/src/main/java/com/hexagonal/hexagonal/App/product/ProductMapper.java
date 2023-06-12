package com.hexagonal.hexagonal.App.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;

public interface ProductMapper {

    ProductResponse from(ProductDto dto);
    ProductDto from(ProductRequest request);
}
