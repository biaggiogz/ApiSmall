package com.project.apiSmall.domain;

import lombok.Data;

@Data
public class UserRest {
    private String userId;
    private String name;
    private String surname;
    private String email;

    public UserRest(){}
}
