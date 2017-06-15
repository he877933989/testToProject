package com.demo.utils;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import com.demo.model.User;
import com.demo.service.IUserService;

/**
 * 缓存工具类
 * @author home_HZQ
 *
 */
@Component("cacheCustomer")
public class CacheManager extends HttpServlet{

	@Autowired  
	private IUserService userService;  
	
	private static Map<String, User> CACHE_USER = new HashMap<String, User>();
	
	@Validated
	public void init(){
		initUser();
		System.out.println("这样在web容器启动的时候，就会执行这句话了！" );

	}
	
	
	public void initUser(){
		CACHE_USER = userService.getUserByCaherToMap();
		System.out.println("执行init");
	}
	
	public static Map<String, User> getCacheUser(){
		return CACHE_USER;
	}
	
	
}
