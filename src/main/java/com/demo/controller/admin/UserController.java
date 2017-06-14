package com.demo.controller.admin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.User;  
import com.demo.service.IUserService;

@Controller  
@RequestMapping("/user")  
public class UserController {  
   @Resource  
   private IUserService userService;  
   
   private Logger logger = LoggerFactory.getLogger(this.getClass());  
     
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){  
	   logger.error("showUser ：" + Thread.currentThread().getId());
       int userId = Integer.parseInt(request.getParameter("id"));  
       User user = userService.getUserById(userId);  
       model.addAttribute("user", user);  
       return "showUser";  
   
   }  
   
   @RequestMapping("/showListUser")  
   public String listUser(HttpServletRequest request,Model model){  
	   
       List<User> uList = userService.getUserList();  
       model.addAttribute("uList", uList);  
       return "listUser";  
   
   } 
   
   
   
}