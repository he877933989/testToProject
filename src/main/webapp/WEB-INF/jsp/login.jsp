<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
 <form action="login.do" method="post">
      <table>
         <tr>
            <td> 用户名：</td>
            <td><input id="j_username" type='text' name='j_username' placeholder="请输入用户名"/></td>
         </tr>
         <tr>
            <td> 密码：</td>
            <td><input id="j_password" type='password' name='j_password' placeholder="请输入密码"/></td>
         </tr>
         <tr>
            <td colspan="2" align="center">
                <input type="submit" value=" 登录 "/>
                <input type="reset" value=" 重置 "/>
            </td>
         </tr>
      </table>
   </form>
</body>
</html>