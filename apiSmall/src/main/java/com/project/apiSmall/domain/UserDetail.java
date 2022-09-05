package com.project.apiSmall.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetail {
    private String name;
    private String surname;
    private String email;
    private String password;

    UserDetail(){}
}
