package cn.seppel.service;


import cn.seppel.entity.User;

public interface UserService {
    User create(String username, String password);
}
