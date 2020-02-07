package com.antivirus.facade.user;

import com.antivirus.facade.user.dto.UserDTO;

public interface UserFacade {


    UserDTO getUserById(String id);

    UserDTO getUserByPhone(String phone);

}
