package com.example.r6siegestats.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserSignInRequest {
    private String email;
    private String password;
}
