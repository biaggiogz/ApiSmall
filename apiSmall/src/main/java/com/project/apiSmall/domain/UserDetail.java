package com.project.apiSmall.domain;

import lombok.Data;

@Data
public class UserDetail {
    private String name;
    private String surname;
    private String email;
    private String password;

    public UserDetail(){}
}
