package com.gian.ecommercebackend.mapper;

import com.gian.ecommercebackend.dto.ProductDto;
import com.gian.ecommercebackend.entity.Product;

public class ProductMapper {

  public static ProductDto mapToProductDto(Product product) {
    return new ProductDto(
        product.getId(),
        product.getProductName(),
        product.getQuantity(),
        product.getOwnerId(),
        product.getCreatedAt(),
        product.getUpdatedAt()
    );
  }

  public static Product mapToProduct(ProductDto productDto) {
    return new Product(
        productDto.getId(),
        productDto.getProductName(),
        productDto.getQuantity(),
        productDto.getOwnerId(),
        productDto.getCreatedAt(),
        productDto.getUpdatedAt()
    );
  }
}
