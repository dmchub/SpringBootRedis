package com.dailycodebuffer.service;

import com.dailycodebuffer.model.User;
import com.dailycodebuffer.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return false;
    }
}
