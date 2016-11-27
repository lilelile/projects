<%@ page language="java" import="java.sql.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>管理员信息管理界面</title>
<head>
<style type="text/css">
#center{
    width: 1000px;
    height: 110px;
    margin: auto;


}
#top{
    width: 1000px;
    height: 110px;
    border-bottom: 6px solid black;
    margin: auto;
    background: pink url(./img/1111.jpg) ;
    background-repeat: no-repeat;
    background-size:1002px; 
    line-height: 110px;
}

#rside{
    width: 800px;
    height: 600px;
    float: right;
    border: 3px solid black;
    background:#F9FAF9;
}
#lside{
    width: 192px;
    height: 600px;
    float: left;
    margin-left: 0px;
    margin-top: 0px;
    background: #FFAD86;
}
#lside a{
    display: block;
    height: 50px;
    margin-top: 40px;
    text-align: center;
    color: #460046;
    font-size: 20px;
    line-height: 50px;
    text-decoration:none;
    font-family: 微软雅黑;


}
#lside ul{
    display: block;
    float: left;
    width: 100px;
}
#lside li{
    display: block;
    background: pink;

    
    
}
</style>
</head>
    <body>

<% 
String driverClass="com.mysql.jdbc.Driver";
String url="jdbc:mysql://localhost:3306/tushu";
String username="root";
String password="root";
Class.forName(driverClass);
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("select * from guanliyuan");	
 %>

    	<div id="center">
    		<div id="top">
                <p align="center" >
                    <font color="black" face="微软雅黑" size="15" >管理员信息管理</font>
                </p>      
            </div>
    		<div id="main">
    			<div id="lside">
                    <ul>
                        <li id="mark2"><a href="addguanli.jsp" target="_blank" title="">添加</a></li>
                        <li id="mark3"><a href="" target="_blank" title="">删除</a></li>
                        <li id="mark4"><a href="guanliyuan.jsp" target="_blank" title="">浏览</a></li>
                        <li id="mark5"><a href="updateguanli.jsp" target="_blank" title="">修改</a></li>
                        
                    </ul>         
                </div>
    			<div id="rside">
                    <p align="center" >
                        <h2 color="black" style="font-family:微软雅黑"><b>管理员信息</b></h2>
                    </p>
                    <table width="663" height="450" border="1" id="table1" align="center">

                        <tr align="center" valign="middle">
                            <td width="80"><div align="center">管理员号</div></td>
                            <td width="116"><div align="center">管理员名</div></td>
                            <td width="76"><div align="center">登录密码</div></td>
                           
                            <td width="88"><div align="center">联系方式</div></td>

                        </tr>
                       
                        
<%while(rs.next()){%>
  <tr align="center" valign="middle">
                            <td width="80" align="center"><%=rs.getString(1) %></td>
                            <td width="116"><%=rs.getString(2) %></td>
                            <td width="76" align="right"><div align="center"><%=rs.getString(3) %></div></td>
                        
                            <td width="88"><div align="center"><%=rs.getString(4) %></div></td>
                            
                        </tr>
               <% }
rs.close();
stmt.close();
conn.close();

%>

                </table>


            </div>
        </div>
        <div id="bottom"></div>
    </div>
    <script src="jquery-1.11.1.js"></script>
    <script>

    </script>
    </body>
</html>

