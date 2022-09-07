package com.project.apiSmall.service;


import com.project.apiSmall.dataTransfer.UserDTO;
import com.project.apiSmall.domain.UserEntity;
import com.project.apiSmall.inTerface.UserService;
import com.project.apiSmall.repository.UserRepository;
import com.project.apiSmall.util.Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {
    @Autowired
    UserRepository userR;
    @Autowired
    Utils util;

    @Override
    public UserDTO createUser(UserDTO userdto) {

        UserEntity userE = new UserEntity();
        BeanUtils.copyProperties(userdto,userE);

        userE.setEncryptedPassword("test");
        userE.setUserId(util.generateUserId(7));

        UserEntity storeUser = userR.save(userE);

        UserDTO userD = new UserDTO();
        BeanUtils.copyProperties(storeUser,userD);
        return userD;
    }
}
