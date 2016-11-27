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
<title>修改管理员信息</title>
 
</head>
 <%DbCon aa=new DbCon() ;
                 aa.getConnetction();%>
                  	<tr>
          	 <%
		       List list = (List) session.getAttribute("list");
		       if (list == null || list.size() == 0){
		      	out.print("no");
		      }
	         %>
 <body align="center">
	     <div id="main">
         
			 修改管理员信息：
     <form name="add"action="guanliAdd" method="post">
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
        <input type="submit"name="update" value="修改"/>
        　　
        <input type="submit"name="return" value="返回" onclick="window.location.href('guanliyuan.jsp')"/>
        </center>
        </form>
</body>
</html>