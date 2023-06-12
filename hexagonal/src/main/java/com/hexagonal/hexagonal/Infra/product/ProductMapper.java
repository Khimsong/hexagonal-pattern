package com.hexagonal.hexagonal.Infra.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;

import javax.swing.text.html.parser.Entity;

public interface ProductMapper {

    ProductEntity from(ProductDto dto);

    ProductDto from(ProductEntity entity);
}
