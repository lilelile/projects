
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>无标题文档</title>
  <script language="JavaScript" src="../js/common.js"></script>  
  <link href="../css/main.css" rel="stylesheet" type="text/css">
</head>

<body>
  <table width="100%" align="center" cellpadding="0" cellspacing="0" class="currentPosition">
    <tr>
      <td width="6" height="22" background="../images/main_top01.gif"></td>
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;系统信息</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>
  <form name="form1" method="post" action="list.html" class="myForm">
    <table width="60%" align="center" cellpadding="0" cellspacing="0" >
      <tr>
        <td colspan="2"><div align="center"><h3><font color="#006699">系统忙，请稍后再试！</font></h3></div></td>
      </tr>
    </table>
    <p align="center">
      <input class="button" type="button" value="返  回"  onClick="back();"/>
    </p>
  </form>
</body>
</html>