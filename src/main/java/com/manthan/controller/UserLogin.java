package com.manthan.controller;

import com.manthan.entity.User;
import com.manthan.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserLogin {

    @Autowired
    UserCrudService userCrudService;

    @RequestMapping(value = "/adduser", method = RequestMethod.POST)
    public User validateUserCred(@RequestBody User user) {
        return this.userCrudService.saveUserDetails(user);
    }

    @RequestMapping(value = "/getallusers", method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return this.userCrudService.getAllUsers();
    }
}
