package com.demo.dao;

import com.demo.model.User;

public interface  IUserDao {
	int deleteByPrimaryKey(Integer id);

    int insert1(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
