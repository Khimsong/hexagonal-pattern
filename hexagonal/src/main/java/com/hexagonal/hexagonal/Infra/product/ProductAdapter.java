package com.hexagonal.hexagonal.Infra.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;
import com.hexagonal.hexagonal.Core.product.ProductDriven;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductAdapter implements ProductDriven {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductDto create(ProductDto dto) {
        ProductEntity entity = productRepository.save(productMapper.from(dto));
        return productMapper.from(entity);
    }
}
