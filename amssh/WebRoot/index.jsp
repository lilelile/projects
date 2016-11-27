<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>

<frameset rows="91,*,40" frameborder="NO" border="0" framespacing="0">
  <frame src="common/top.jsp" name="topFrame" scrolling="NO" noresize >
  <frameset cols="186,*" frameborder="NO" border="0" framespacing="0">
    <frame src="common/menu.jsp" name="leftFrame" scrolling="auto" noresize>
    <frame src="common/map.jsp" name="mainFrame" scrolling="yes">
  </frameset>
  <frame src="common/bottom.jsp" name="bottomFrame" scrolling="NO" noresize >
</frameset>
<noframes><body>
</body></noframes>
</html>
