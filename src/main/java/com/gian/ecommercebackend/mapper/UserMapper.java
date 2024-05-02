package com.gian.ecommercebackend.mapper;

import com.gian.ecommercebackend.dto.UserDto;
import com.gian.ecommercebackend.entity.User;

public class UserMapper {

  public static UserDto mapToUserDto(User user) {
    return new UserDto(
        user.getId(),
        user.getFirstName(),
        user.getLastName(),
        user.getMiddleName(),
        user.getEmail(),
        user.getPhone(),
        user.getBirthMonth(),
        user.getBirthDate(),
        user.getBirthYear()
    );
  }

  public static User mapToUser(UserDto userDto) {
    return new User(
        userDto.getId(),
        userDto.getFirstName(),
        userDto.getLastName(),
        userDto.getMiddleName(),
        userDto.getEmail(),
        userDto.getPhone(),
        userDto.getBirthMonth(),
        userDto.getBirthDate(),
        userDto.getBirthYear()
    );
  }
}
