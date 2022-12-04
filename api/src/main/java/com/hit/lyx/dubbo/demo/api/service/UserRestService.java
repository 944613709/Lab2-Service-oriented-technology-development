package com.hit.lyx.dubbo.demo.api.service;

import com.hit.lyx.dubbo.demo.api.entity.User;

import javax.validation.constraints.Min;

public interface UserRestService {

    User getUser(@Min(value = 1L, message = "UserID must be greater than 1") Long id);
}
