package com.gian.ecommercebackend.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

  private Long id;
  private String productName;
  private int quantity;
  private Long ownerId;
  private Date createdAt;
  private Date updatedAt;
}
