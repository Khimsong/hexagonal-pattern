package com.hexagonal.hexagonal.Core.product;

public interface ProductDriving {

    /**
     * Create product
     *
     * @param dto ProductDto
     * @return ProductDto
     */
    ProductDto create(ProductDto dto);
}
