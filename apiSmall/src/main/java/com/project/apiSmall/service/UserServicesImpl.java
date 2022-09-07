package com.project.apiSmall.service;


import com.project.apiSmall.dataTransfer.UserDTO;
import com.project.apiSmall.domain.UserEntity;
import com.project.apiSmall.inTerface.UserService;
import com.project.apiSmall.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {
    @Autowired
    UserRepository userR;

    @Override
    public UserDTO createUser(UserDTO userdto) {

        UserEntity userE = new UserEntity();
        BeanUtils.copyProperties(userdto,userE);



        userE.setEncryptedPassword("test");
        userE.setUserId("testID");

        UserEntity storeUser = userR.save(userE);

        UserDTO userD = new UserDTO();
        BeanUtils.copyProperties(storeUser,userD);
        return userD;
    }
}
