package com.hexagonal.hexagonal.App.product;

import com.hexagonal.hexagonal.Core.product.ProductDriving;
import com.hexagonal.hexagonal.Core.product.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductDriving productDriving;
    private final ProductMapper productMapper;

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest request) {
        ProductDto dto = productMapper.from(request);
        ProductResponse response = productMapper.from(productDriving.create(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


}
