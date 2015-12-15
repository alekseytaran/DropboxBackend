package com.teamdev.dto;

import com.teamdev.service.AccessToken;

public class UserDto {

    private String name;
    private String mail;
    private AccessToken accessToken;

    public UserDto() {
    }

    public UserDto(String name, String mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public AccessToken getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDto userDto = (UserDto) o;

        if (!name.equals(userDto.name)) return false;
        return mail.equals(userDto.mail);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + mail.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
