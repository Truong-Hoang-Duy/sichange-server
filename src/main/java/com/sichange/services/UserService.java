package com.sichange.services;

import com.sichange.dto.requests.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
