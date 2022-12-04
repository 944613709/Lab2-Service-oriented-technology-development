package com.hit.lyx.dubbo.demo.service;

import com.hit.lyx.dubbo.demo.api.entity.User;
import com.hit.lyx.dubbo.demo.api.service.UserService;

public class UserServiceImpl implements UserService {

    public User getUser(Long id) {
        return new User(id, "username" + id);
    }
}
