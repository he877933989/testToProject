package com.demo.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IUserDao;
import com.demo.dao.daoImpl.IUserDaoExt;
import com.demo.model.User;
import com.demo.service.IUserService;

@Service("userService") 
public class UserServiceImpl implements IUserService {
	
	@Resource  
    private IUserDao userDao; 
	@Resource  
    private IUserDaoExt userDaoExt; 
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		System.out.println("/showUser 再次调用 ： "+ Thread.currentThread().getId());
		return userDao.selectByPrimaryKey(userId);
		//return (User)sqlSession.selectOne("com.demo.mapping.UserMapper.selectByPrimaryKey", userId);
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		List<User> uList = userDaoExt.selectByPrimary();
		if(uList.isEmpty()){
			return null;
		}
		return uList;
	}

	@Override
	public Map<String, User> getUserByCaherToMap() {
		// TODO Auto-generated method stub
		List<User> uList = getUserList();
		Map<String, User> uMap = new HashMap<String, User>();
		if(uList.isEmpty()){
			return uMap;
		}else{
			for(User u:uList){
				uMap.put(u.getUserName(), u);
			}
		}
		return uMap;
	}
	
}
