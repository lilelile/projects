<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.*" %>
<%@page import="java.sql.DriverManager" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center><table border=1  class="table">
 	<% 
		String driverClass ="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/yunhuo";
		String  username="root";
		String password= "root";
		Connection conn;
		try{
		Class.forName(driverClass);
		conn=DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from fhd");
		
	%>  

     <thead >
        <tr>
        	<th>电影订单编号</th>
            <th>电影名</th>
            <th>电影类型</th>
            <th>上映时间</th>
            <th>座位</th>
            <th>费用</th>
        </tr>
     </thead>
     	
	<%
		while(rs.next()){
		String  num=rs.getString("id");
	%>
     <tbody >
        <tr>
       		 <td><%=num %></td>
           <td><%=rs.getString("film") %></td>
           <td><%=rs.getString("type") %></td>
           <td><%=rs.getString("date") %></td>
           <td><%=rs.getString("seat") %></td>
            <td><%=rs.getString("cost") %></td>
           </tr>  
           </tbody>
           	<% 
    }
    }
    catch(Exception e){
    e.printStackTrace();
    }
    %>
</body>
</html>
