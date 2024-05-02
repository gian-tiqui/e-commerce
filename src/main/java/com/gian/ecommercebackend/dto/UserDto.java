package com.gian.ecommercebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  private Long id;
  private String firstName;
  private String lastName;
  private String middleName;
  private String email;
  private String phone;
  private int birthMonth;
  private int birthDate;
  private int birthYear;
}
