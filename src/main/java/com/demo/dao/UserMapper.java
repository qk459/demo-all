package com.demo.dao;

import com.demo.entity.User;
import com.demo.entity.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where user_Id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    @Insert({
        "insert into user (user_Id, user_Name, ",
        "phone, create_Time, ",
        "age)",
        "values (#{userId,jdbcType=INTEGER}, #{userName,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{age,jdbcType=INTEGER})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="user_Id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_Name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_Time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "user_Id, user_Name, phone, create_Time, age",
        "from user",
        "where user_Id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_Id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_Name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_Time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(Integer userId);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set user_Name = #{userName,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "create_Time = #{createTime,jdbcType=TIMESTAMP},",
          "age = #{age,jdbcType=INTEGER}",
        "where user_Id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}