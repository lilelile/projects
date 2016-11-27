<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
  <title>top</title>
  <script src="../js/tool.js"></script>
  <link href="../css/frame.css" rel="stylesheet" type="text/css" />
  <script language="JavaScript"> 
    function toTop(url){   //转到frame的外层
      if (window != top) 
        top.location.href = url; 
    }
  </script>  
</head>

<body>
   <table width="100%" height="64" border="0" align="center" cellpadding="0" cellspacing="0" 
     background="../images/bg01.gif">
    <tr>
      <td style="font-family:黑体;font-size:30px;font-weight:bold; color:#FFFFFF; width:350px;">员工活动审批管理系统</td>
    </tr>
  </table>
  <table width="100%" height="27" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="625" background="../images/bg02.gif">　欢迎您: <%=session.getAttribute("uname") %> （职务:<%=session.getAttribute("type") %>）</td>
      <td width="43" align="left" background="../images/bg03.gif"><img src="../images/top01.gif" width="41" height="27" /></td>
      <td width="50" background="../images/bg03.gif"><font color="#FFFFFF"><span onClick="toTop('../login.jsp');" style="cursor:hand;">退出</span> </font></td>
    </tr>
  </table>

</body>
</html>