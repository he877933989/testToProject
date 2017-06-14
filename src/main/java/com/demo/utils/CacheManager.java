package com.demo.utils;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

import org.springframework.cache.annotation.Cacheable;

import com.demo.model.User;
import com.demo.service.IUserService;

/**
 * 缓存工具类
 * @author home_HZQ
 *
 */
@Cacheable
public class CacheManager extends HttpServlet{

	@Resource  
	private IUserService userService;
	
	private static Map<String, User> CACHE_USER = new HashMap<String, User>();
	
	public void init(){
		initUser();
		System.out.println("这样在web容器启动的时候，就会执行这句话了！" );

	}
	
	
	public void initUser(){
		CACHE_USER = userService.getUserByCaherToMap();
	}
	
	public static Map<String, User> getCacheUser(){
		return CACHE_USER;
	}
	
	
}
