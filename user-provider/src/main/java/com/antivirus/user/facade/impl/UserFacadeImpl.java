package com.antivirus.user.facade.impl;

import com.antivirus.facade.user.UserFacade;
import com.antivirus.facade.user.dto.UserDTO;
import com.antivirus.user.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserFacadeImpl implements UserFacade {

    @Autowired
    UserService userService;


    @Override
    public UserDTO getUserById(String id) {
        return null;
    }

    @Override
    public UserDTO getUserByPhone(String phone) {
        return null;
    }
}
