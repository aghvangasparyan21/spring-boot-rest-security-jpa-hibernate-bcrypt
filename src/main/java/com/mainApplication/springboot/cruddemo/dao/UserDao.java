package com.mainApplication.springboot.cruddemo.dao;

import com.mainApplication.springboot.cruddemo.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
}
