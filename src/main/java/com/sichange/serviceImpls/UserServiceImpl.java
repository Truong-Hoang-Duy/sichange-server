package com.sichange.serviceImpls;

import com.sichange.dto.mapper.UserMapper;
import com.sichange.dto.requests.UserDto;
import com.sichange.entity.UserEntity;
import com.sichange.repository.UserRepository;
import com.sichange.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

import static com.sichange.utils.TimeUtils.getCurrentTimestamp;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository repository;
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto createUser(UserDto userDto) {
        UserEntity user = UserMapper.mapToUser(userDto);

        Timestamp currentTimestamp = getCurrentTimestamp();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreateDate(currentTimestamp);

        UserEntity addUser = repository.save(user);
        user.setCreateId(user.getId());
        repository.save(user);

        return UserMapper.mapToUserDto(addUser);
    }
}
