package com.manthan.service;

import com.manthan.entity.User;

import java.util.List;

public interface UserCrudService {
    public List<User> getAllUsers();
    public User saveUserDetails(User user);
}
