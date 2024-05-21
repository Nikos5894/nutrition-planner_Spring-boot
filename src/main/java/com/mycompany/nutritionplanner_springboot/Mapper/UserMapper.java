package com.mycompany.nutritionplanner_springboot.Mapper;

import com.mycompany.nutritionplanner_springboot.DTO.UserDto;
import com.mycompany.nutritionplanner_springboot.Entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "id", ignore = true)
    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);
}
