<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>影院售票系统会员登录</title>
  <link href="css/frame.css" rel="stylesheet" type="text/css" /> 
</head>
<body>
  <table width="100%" height="64" border="0" align="center" cellpadding="0" cellspacing="0" 
     background="images/bg01.gif">
    <tr>
      <td style="font-family:黑体;font-size:30px;font-weight:bold; color:#FFFFFF; width:350px;">员工活动审批管理系统</td>
    </tr>
  </table>
  <table width="100%" height="27" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="625" background="images/bg02.gif">　欢迎使用!请您登录!</td>
      <td width="43" align="left" background="images/bg03.gif"><img src="images/top01.gif" width="41" height="27" /></td>
      <td width="50" background="images/bg03.gif"><font color="#FFFFFF"><span></span> </font></td>
    </tr>
  </table>

  <br/><br/><br/><br/>
  <s:form name="form1" action="loginAction" method="post" cssClass="myForm">
    <table style="width:230px" align="center" cellpadding="0" cellspacing="0" class="searchTable" >
      <tr>
        <td bgcolor="#F6F6F6">用户名：</td>
        <td><div align="left"><span class="altbg1">
          <s:textfield name="uname" size="20"/>
        </span></div></td>
      </tr>
      <tr>
        <td bgcolor="#F6F6F6">密&nbsp;&nbsp;码：</td>
        <td><div align="left"><span class="altbg1">
           <s:textfield name="pwd" size="20"/>
        </span></div></td>
      </tr>
    </table>
    <p align="center">
      <input type="submit" class="button" value="登  录" ></input>		
    </p>
  </s:form>

  <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
  <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td height="2" bgcolor="#425673">&nbsp;</td>
    </tr>
    <tr>
      <td height="30" align="center" bgcolor="#EBEBEE">&copy; 达内科技产品 2011~2013</td>
    </tr>
  </table>

</body>
</html>
