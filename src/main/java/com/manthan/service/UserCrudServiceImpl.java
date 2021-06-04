package com.manthan.service;

import com.manthan.entity.User;
import com.manthan.repository.UserCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCrudServiceImpl implements UserCrudService{
    @Autowired
    UserCrudRepo userCrudRepo;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) userCrudRepo.findAll();
    }

    @Override
    public User saveUserDetails(User user) {
        return this.userCrudRepo.save(user);
    }
}
