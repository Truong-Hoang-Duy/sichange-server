package com.sichange.dto.requests;

import lombok.*;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

    private String createId;
    private Timestamp createDate;
    private String updateId;
    private Timestamp updateDate;
}
