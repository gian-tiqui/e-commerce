package com.gian.ecommercebackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "middle_name")
  private String middleName;

  @Column(name = "email_id", nullable = false, unique = true)
  private String email;

  @Column(name = "phone")
  private String phone;

  @Column(name = "birth_month")
  private int birthMonth;

  @Column(name = "birth_date")
  private int birthDate;

  @Column(name = "birth_year")
  private int birthYear;
}
