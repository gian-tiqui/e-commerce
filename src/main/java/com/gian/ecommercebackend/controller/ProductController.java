package com.gian.ecommercebackend.controller;

import com.gian.ecommercebackend.dto.ProductDto;
import com.gian.ecommercebackend.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

  private ProductService productService;

  @PostMapping
  public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
    ProductDto savedProduct = productService.createProduct(productDto);

    return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
  }

  @GetMapping("{id}")
  public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long productId) {

    ProductDto foundProduct = productService.getEmployeeById(productId);

    return ResponseEntity.ok(foundProduct);
  }

  @GetMapping
  public ResponseEntity<List<ProductDto>> getAllProducts() {
    List<ProductDto> productDtos = productService.getProducts();

    return ResponseEntity.ok(productDtos);
  }

  @PatchMapping("{id}")
  public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") Long productId, @RequestBody ProductDto updatedProductDto) {
    ProductDto productDto = productService.updateProduct(productId, updatedProductDto);

    return ResponseEntity.ok(productDto);
  }

  @DeleteMapping("{id}")
  public ResponseEntity<String> deleteProductById(@PathVariable("id") Long productId) {
    productService.deleteProduct(productId);

    return ResponseEntity.ok("Product deleted");
  }
}
