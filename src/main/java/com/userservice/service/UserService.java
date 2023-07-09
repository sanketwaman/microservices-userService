package com.userservice.service;

import com.userservice.entities.User;

import java.util.List;

public interface UserService  {
    // user operations

    // create
   User saveUser(User user);

   // get ALl Users
    List<User> getAllUser();


    //get single user of given userId

    User getUser(String userId);

    // ToDo Delete and Update
}
