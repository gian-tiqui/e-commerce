package com.gian.ecommercebackend.service;

import com.gian.ecommercebackend.dto.ProductDto;

import java.util.List;

public interface ProductService {

  ProductDto createProduct(ProductDto productDto);
  ProductDto getEmployeeById(Long productId);
  List<ProductDto> getProducts();
}
