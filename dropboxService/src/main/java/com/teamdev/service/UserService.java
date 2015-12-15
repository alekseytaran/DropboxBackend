package com.teamdev.service;

import com.teamdev.dto.UserDto;

public interface UserService {

    UserDto signUp(UserDto user);

    AccessToken logIn(String loginName, String password);

    void logOut(AccessToken accessToken);



}
