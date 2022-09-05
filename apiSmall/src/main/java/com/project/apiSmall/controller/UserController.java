package com.project.apiSmall.controller;

import com.project.apiSmall.domain.UserDetail;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public  String getUser(){
        return "getuser was called";
    }

    @PostMapping
    public  String createUser(@RequestBody UserDetail userdetails){
        return "createUser was called";
    }
}
