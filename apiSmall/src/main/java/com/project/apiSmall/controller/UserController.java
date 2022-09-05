package com.project.apiSmall.controller;

import com.project.apiSmall.dataTransfer.UserDTO;
import com.project.apiSmall.domain.UserDetail;
import com.project.apiSmall.domain.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public  String getUser(){
        return "getuser was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetail userdetails){

        UserRest uRest = new UserRest();
        UserDTO uDTO = new UserDTO();
        BeanUtils.copyProperties(userdetails,uDTO);

        return null;
    }
}
