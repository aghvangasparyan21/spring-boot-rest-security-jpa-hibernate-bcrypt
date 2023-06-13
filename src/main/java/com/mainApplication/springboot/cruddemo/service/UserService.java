package com.mainApplication.springboot.cruddemo.service;

import com.mainApplication.springboot.cruddemo.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

}
