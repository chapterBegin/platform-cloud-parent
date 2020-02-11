package com.antivirus.applet.controller;


import com.antivirus.facade.user.UserFacade;
import com.antivirus.facade.user.dto.UserDTO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserFacade userFacade;

    @RequestMapping("/getById")
    public UserDTO getById(@RequestParam("id") String id) {
        return userFacade.getUserById(id);
    }


}
