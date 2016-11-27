<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
  <title>menu</title>
  <link href="../css/frame.css" rel="stylesheet" type="text/css" />
  <script language="JavaScript" src="../js/tool.js"></script>
  <style type="text/css">
    <!--
    .STYLE1 {	color: #FFFFFF;
      font-weight: bold;
    }
    body {
      margin-left: 0px;
      margin-top: 0px;
    }
    -->
  </style>
</head>

<body bgcolor="#EFEEF7">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="100%" class="line3">
      <table width="175" border="0" align="center" cellpadding="0" cellspacing="0">
        <tr>
          <td><img src="../images/left_menu.gif" width="175" height="28" /></td>
        </tr>
      </table>
      <table width="165" border="0" align="center" cellpadding="0" cellspacing="0" background="../images/bg05.gif">
        <tr>
          <td><img src="../images/left_top.gif" width="165" height="3" /></td>
        </tr>
        <tr>
          <td>
            <table align="center" class="menu">
              <tr>
                <td width="30">&nbsp;</td>
                <td width="126"><span onClick="changeDisplay('productMg')" style="cursor:hand;">我的工作</span></td>
              </tr>
            </table>
            <table align="center" class="menu2" id="productMg">
              <tr>
                <td width="30">&nbsp;</td>
                <td width="126"><a href="ShowActivity?uid=<%=session.getAttribute("uid")%>" target="mainFrame">活动维护</a></td>
              </tr>
            </table>       
          </td>
        </tr>  