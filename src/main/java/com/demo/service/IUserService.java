package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.model.User;

public interface IUserService {
    User getUserById(int userId);  
    List<User> getUserList();
    Map<String, User> getUserByCaherToMap();
}
