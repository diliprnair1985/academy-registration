package com.org.academyregistration.user.service;

import com.org.academyregistration.user.model.UserModel;

public interface UserService {
    UserModel addUser(UserModel user);

    UserModel updateUser(UserModel user);

    int deleteUser(String userId);

    UserModel readUser(String userId);


}
