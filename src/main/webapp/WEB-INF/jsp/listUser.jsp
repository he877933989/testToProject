 <%@page import="com.demo.model.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <title>测试</title>  
  </head>  
    
  <body>  
  <%
  	List<User> uList = (List<User>)request.getAttribute("uList");
  	for(User u:uList){ %>
  
    	测试名称 : <%=u.getUserName() %> <br/>
  
  <%} %>
  </body>  
</html>
