package com.example.demoall.demo.dao.baseDao;

import com.demo.entity.TUserCoupon;

public interface TUserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserCoupon record);

    int insertSelective(TUserCoupon record);

    TUserCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserCoupon record);

    int updateByPrimaryKey(TUserCoupon record);
}