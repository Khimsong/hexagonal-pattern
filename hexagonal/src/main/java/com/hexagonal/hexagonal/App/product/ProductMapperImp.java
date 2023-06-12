package com.hexagonal.hexagonal.App.product;

import com.hexagonal.hexagonal.Core.product.ProductDto;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImp implements ProductMapper {

    @Override
    public ProductResponse from(ProductDto dto) {
        ProductResponse response = new ProductResponse();
        response.setId(dto.getId());
        response.setName(dto.getName());
        response.setDescription(dto.getDescription());
        return response;
    }

    @Override
    public ProductDto from(ProductRequest request) {
        ProductDto dto = new ProductDto();
        dto.setName(request.getName());
        dto.setDescription(request.getDescription());
        return dto;
    }
}
