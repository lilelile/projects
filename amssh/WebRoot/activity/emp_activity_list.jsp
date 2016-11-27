<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>活动信息管理</title>
  <script language="JavaScript" src="../js/common.js"></script>
  <script language="JavaScript" src="../js/sortTable.js"></script>
  <link href="../css/main.css" rel="stylesheet" type="text/css">
</head>

<body>

  <table width="100%" align="center" cellpadding="0" cellspacing="0" class="currentPosition">
    <tr>
      <td width="6" height="22" background="../images/main_top01.gif"></td>
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;活动信息管理 &gt;&gt; 活动列表</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>

  <form name="form1" method="post" action="" class="myForm">
    <table style="width:900px" align="center" cellpadding="0" cellspacing="0" class="resultTable" id="sortable">
      <tr>
        <th width="5%" height="27"><div align="center">序号</div>        </th>
        <th width="36%">活动标题
        <th width="11%">活动经费        
        <th width="11%">活动开始时间
        <th width="10%">活动结束时间        
        <th width="11%">活动状态
        <th width="16%">操作      </tr>
        <%! int count=1; %>
        <s:iterator value="#session.activitylist" id="activity" >  
                    <tr>
                        <td><div align="center"><%= count++ %></td>
                        <td>${activity.tile}</td>
                        <td>${activity.outlay}</td>
                        <td>${activity.sdate}</td>
                        <td>${activity.edate}</td>
                        <td>${activity.statusName}</td>
                         <td><a href="ShowActivityDetail?id=<s:property value="#activity.id"/>">查看明细</a>
                         <s:if test="#activity.status==0 || #activity.status==3 || #activity.status==5"> | <a href="deleteactivityaction?id=<s:property value="#activity.id"/>">取消</a></td></s:if>
                         <s:else> </td> </s:else>
                          
                         
                       
                    </tr>
         </s:iterator>
                    
    </table>
    <table style="width:900px" align="center" cellpadding="0" cellspacing="1" class="resultTableFooter">       
    </table>
    <table align="center" class="myForm">
      <tr>
        <td>
          <div class="button_bar" align="center">
		  <input type="button" class="button" value="发起新活动" onClick="to('../activity/emp_add_activity.jsp');"></input>
          <input type="button" class="button" value="返  回" onClick="back();"></input>
          </div>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
