package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.model.User;

public interface IUserService {
    public User getUserById(int userId);  
    public List<User> getUserList();
    public Map<String, User> getUserByCaherToMap();
}
