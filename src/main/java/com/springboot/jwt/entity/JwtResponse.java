package com.springboot.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class JwtResponse {

    private User user;
    private String jwtToken;
}
