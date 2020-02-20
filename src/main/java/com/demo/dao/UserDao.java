package com.demo.dao;

import com.demo.dao.baseDao.UserMapper;
import com.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @program: demoAll->UserDao
 * @author: liuquan
 * @date: 2019/12/08
 **/
@Mapper
public interface UserDao extends UserMapper {
    @Select("select * from user")
    List<User> getAllUser();
    @Select("select * from user where age=#{age}")
    List<User>  selectExtTest(Integer age);
}
