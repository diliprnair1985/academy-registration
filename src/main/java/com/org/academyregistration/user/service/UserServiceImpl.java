package com.org.academyregistration.user.service;

import com.org.academyregistration.user.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserModel addUser(UserModel user) {
        /*
        1) Set all the user values and then insert into aws database
         */
        return null;
    }

    @Override
    public UserModel updateUser(UserModel user) {
        return null;
    }

    @Override
    public int deleteUser(String userId) {
        return 0;
    }

    @Override
    public UserModel readUser(String userId) {
        return null;
    }
}
