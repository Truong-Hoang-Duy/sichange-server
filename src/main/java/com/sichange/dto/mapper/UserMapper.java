package com.sichange.dto.mapper;

import com.sichange.dto.requests.UserDto;
import com.sichange.entity.UserEntity;

public class UserMapper {
    public static UserDto mapToUserDto(UserEntity user) {
        return new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(),
                user.getRole(), user.getCreateId(), user.getCreateDate(), user.getUpdateId(), user.getUpdateDate());
    }

    public static UserEntity mapToUser(UserDto userDto){
        return new UserEntity(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail(), userDto.getPassword(),
                userDto.getRole(), userDto.getCreateDate(), userDto.getCreateId(), userDto.getUpdateDate(), userDto.getUpdateId());
    }
}
