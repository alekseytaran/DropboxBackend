package com.teamdev.service;

import com.teamdev.dto.UserDto;

public interface AccessToken {

    String generateAccessToken(UserDto userDto);

}
