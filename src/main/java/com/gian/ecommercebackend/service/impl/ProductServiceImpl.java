package com.gian.ecommercebackend.service.impl;

import com.gian.ecommercebackend.dto.ProductDto;
import com.gian.ecommercebackend.entity.Product;
import com.gian.ecommercebackend.exception.ResourceNotFoundException;
import com.gian.ecommercebackend.mapper.ProductMapper;
import com.gian.ecommercebackend.repository.ProductRepository;
import com.gian.ecommercebackend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

  private ProductRepository productRepository;

  @Override
  public ProductDto createProduct(ProductDto productDto) {

    Product product = ProductMapper.mapToProduct(productDto);

    Product savedProduct = productRepository.save(product);

    return ProductMapper.mapToProductDto(savedProduct);
  }

  @Override
  public ProductDto getEmployeeById(@RequestBody Long productId) {

    Product foundProduct = productRepository
        .findById(productId).orElseThrow(
            () -> new ResourceNotFoundException("Employee does not exist with id" + productId)
        );

    return ProductMapper.mapToProductDto(foundProduct);
  }

  @Override
  public List<ProductDto> getProducts() {
    List<Product> products = productRepository.findAll();
    return products
        .stream()
        .map(ProductMapper::mapToProductDto)
        .collect(Collectors.toList());
  }

  @Override
  public ProductDto updateProduct(Long productId, ProductDto updatedProductDto) {

    Product foundProduct = productRepository
        .findById(productId)
        .orElseThrow(
            () -> new ResourceNotFoundException("Product not found")
        );

    if (updatedProductDto.getProductName() != null) {
      foundProduct.setProductName(updatedProductDto.getProductName());
    }

    if (updatedProductDto.getOwnerId() != null) {
      foundProduct.setOwnerId(updatedProductDto.getOwnerId());
    }

    if (updatedProductDto.getQuantity() != 0) {
      foundProduct.setQuantity(updatedProductDto.getQuantity());
    }

    Product updatedProductObj = productRepository.save(foundProduct);

    return ProductMapper.mapToProductDto(updatedProductObj);
  }

  @Override
  public void deleteProduct(Long productId) {

    Product deleteProduct = productRepository
        .findById(productId).orElseThrow(
            () -> new ResourceNotFoundException("Employee does not exist with id" + productId)
        );

    productRepository.deleteById(productId);
  }
}
