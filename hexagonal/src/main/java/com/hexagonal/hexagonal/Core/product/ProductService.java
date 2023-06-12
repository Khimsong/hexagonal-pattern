package com.hexagonal.hexagonal.Core.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductDriving {

    private final ProductDriven productDriven;
    @Override
    public ProductDto create(ProductDto dto) {
        return productDriven.create(dto);
    }
}
