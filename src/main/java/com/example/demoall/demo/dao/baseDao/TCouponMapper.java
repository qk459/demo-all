package com.example.demoall.demo.dao.baseDao;

import com.demo.entity.TCoupon;
import org.apache.ibatis.annotations.Mapper;


public interface TCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCoupon record);

    int insertSelective(TCoupon record);

    TCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCoupon record);

    int updateByPrimaryKey(TCoupon record);
}