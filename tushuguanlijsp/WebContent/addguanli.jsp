<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
<%@page import="JavaBean.*"%>
<%@page import="text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <link rel="stylesheet" href="css/guanliyuan.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员信息</title>
 
</head>
 <body align="center">
	     <div id="main">
         
			 增加管理员信息：
     <form action="guanliAdd" method="post">
       <table width="201" height="20" border="1" id="table1" align="center">
       <tr> 
         <td>管理员号<input name="Aid"type="text"/>                               
       </td>
       </tr>
        <tr> 
         <td>管理员名<input name="Aname"type="text" />                                 
       </td>
       </tr>
        <tr> 
         <td>登录密码<input name="Password"type="text"/>
       </td>
       </tr>
        <tr> 
         <td>联系方式<input name="Atel"type="text"/>                                 
       </td>
       </tr>
       <tr>
   
        </table>
        <br>
        <center>
        <td><input type="submit"name="submit" value="增加"/>
        　　
        <td><input type="reset" name="reset" value="返回" /></td></tr>
        </center>
        </form>
</body>
</html>