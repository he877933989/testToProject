package com.demo.dao.daoImpl;

import java.util.List;

import com.demo.model.User;

public interface IUserDaoExt {
	List<User> selectByPrimary();
}
