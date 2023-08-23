package com.sichange.controller;

import com.sichange.dto.requests.UserDto;
import com.sichange.serviceImpls.UserServiceImpl;
import com.sichange.utils.ResponseHandler;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {
    private UserServiceImpl service;

    @PostMapping
    public ResponseEntity<Object> Post(@RequestBody UserDto user) {
        try {
            UserDto addUser = service.createUser(user);
            return ResponseHandler.response("User added to system", HttpStatus.CREATED, addUser);
        }catch (Exception e) {
            return ResponseHandler.response("Email already exists", HttpStatus.CONFLICT, null);
        }
    }
}
