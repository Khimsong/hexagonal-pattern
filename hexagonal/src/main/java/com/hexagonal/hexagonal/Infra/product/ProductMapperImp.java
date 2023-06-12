package com.hexagonal.hexagonal.Infra.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImp implements ProductMapper {
    @Override
    public ProductEntity from(ProductDto dto) {
        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    @Override
    public ProductDto from(ProductEntity entity) {
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }
}
