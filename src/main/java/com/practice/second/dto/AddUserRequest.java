package com.practice.second.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUserRequest {
    public String email;
    public String password;
}
