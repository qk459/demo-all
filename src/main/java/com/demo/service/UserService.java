package com.demo.service;

import com.demo.dao.UserMapper;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

  /*  public List<User> getAllUser() {
        UserExample userExample=new UserExample();
        return userMapper.selectByExample();
    }

    public List<User> selectExtTest(Integer age) {
        return userMapper.selectExtTest(age);
    }*/
}
