package com.teamdev.service;

import com.teamdev.dto.UserDto;

public interface UserService {

    UserDto signUp(UserDto user);

    String logIn(String loginName, String password);

    void logOut(AccessToken accessToken);
}
