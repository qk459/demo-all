package com.demo.service;

import com.demo.dao.SysUserMapper;
import com.demo.dao.UserScoreMapper;
import com.demo.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public  SysUser getUserById(Integer userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }


}
