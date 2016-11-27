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
  <script language="JavaScript" src="../js/sortTable.js"></script>
  <script language="JavaScript" src="../js/calendar.js"></script>    
  <link href="../css/main.css" rel="stylesheet" type="text/css">
</head>

<body>
  <table width="100%" align="center" cellpadding="0" cellspacing="0" class="currentPosition">
    <tr>
      <td width="6" height="22" background="../images/main_top01.gif"></td>
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;活动管理 &gt;&gt; 发起新活动</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>
  <form name="form1" method="post" action="addactivityaction" class="myForm">
    <table width="742" align="center" cellpadding="0" cellspacing="0" class="searchTable" style="width:800px" >
      <tr>
        <td width="67" bgcolor="#F6F6F6">活动标题</td>
        <td colspan="7"><div align="left"><span class="altbg1">
          <input type="text" name="tile" maxlength="80" size="80">
        </span></div></td>		
      </tr>

      <tr>
        <td width="67" bgcolor="#F6F6F6">开始时间</td>
        <td width="211"><div align="left"><span class="altbg1">
          <input type="text" name="sdate"><img src="../images/new.gif" width="16" height="16" onClick="calendar(sdate)">
        </span></div></td>
        <td width="76" bgcolor="#F6F6F6">结束时间</td>
        <td width="234"><div align="left"><span class="altbg1">
          <input type="text" name="edate">
          <img src="../images/new.gif" width="16" height="16" onClick="calendar(edate)">
        </span></div></td>
		<td width="65" bgcolor="#F6F6F6">活动经费</td>
        <td width="145" colspan="3"><div align="left"><span class="altbg1">
          <input type="text" name="outlay" value="" width="70">
        </span></div></td>	
      </tr>
	  <tr>
        <td bgcolor="#F6F6F6">活动描述</td>
        <td colspan="7"><textarea name="description" cols="100" rows="5"></textarea></td>
      </tr>
    </table>
    <p align="center">
      <input class="button" type="submit" value="添  加"  name="settingsubmit"  />
	  <input type="button" class="button" value="返  回" onClick="back();"></input>
    </p>
  </form>
</body>
</html>
