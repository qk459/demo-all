package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(Integer userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    public List<User> selectExtTest(Integer age) {
        return userDao.selectExtTest(age);
    }
}
