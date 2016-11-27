<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="ams.po.activity"%>
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
<% activity a=(activity)session.getAttribute("activity"); %>
  <table width="100%" align="center" cellpadding="0" cellspacing="0" class="currentPosition">
    <tr>
      <td width="6" height="22" background="../images/main_top01.gif"></td>
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;活动信息管理 &gt;&gt; 活动明细</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>
  <form name="form1" method="post" action="updateactivityaction?id=<%=a.getId() %>" class="myForm">
    <h5 align="center" class="STYLE36">活动详细信息</h5>
    <table width="742" align="center" cellpadding="0" cellspacing="0" class="searchTable" style="width:850px" >
      <tr>
        <td bgcolor="#F6F6F6">活动标题</td>
        <td colspan="3"><div align="left"><span class="altbg1">
            <input type="text" name="tile" value="<%=a.getTile() %>" maxlength="70" size="70">
        </span></div></td>
        <td bgcolor="#F6F6F6">活动经费</td>
        <td width="189"><div align="left"><span class="altbg1">
            <input type="text" name="outlay" value="<%=a.getOutlay()%>">
        </span></div></td>
      </tr>
      <tr>
        <td width="71" bgcolor="#F6F6F6">开始时间</td>
		<td width="211"><div align="left"><span class="altbg1">
          <input type="text" name="sdate" value="<%=a.getSdate()%>">
		  <img src="../images/new.gif" width="16" height="16" onClick="calendar(sdate)">
        </span></div></td>
        <td width="64" bgcolor="#F6F6F6">结束时间</td>
        <td width="234"><div align="left"><span class="altbg1">
          <input type="text" name="edate" value="<%=a.getEdate()%>">
          <img src="../images/new.gif" width="16" height="16" onClick="calendar(edate)">
        </span></div></td>
        <td width="83" bgcolor="#F6F6F6">创建时间</td>
        <td><%=a.getCreate_date() %></td>
      </tr>
      <tr>
        <td width="71" bgcolor="#F6F6F6">活动状态</td>
        <td colspan="5"><%=a.getStatusName() %></td>
      </tr>	 
	  <tr>
        <td bgcolor="#F6F6F6">活动描述</td>
        <td colspan="5"><div align="left"><%=a.getDescription() %></div></td>
      </tr>
    </table>
	  
	<h5 align="center" class="STYLE36">审核历史记录</h5>

	<table style="width:850px" align="center" cellpadding="0" cellspacing="0" class="resultTable" id="sortable">
      <tr>
        <th width="8%" height="27"><div align="center">序号</div></th>
        <th width="13%">审核人</th>
        <th width="10%">职务</th>
        <th width="17%">审核时间</th>
        <th width="52%">审核意见</th>
      </tr>
      <%! int count=1; %>
        <s:iterator value="#session.approvelist" id="approve" >  
                    <tr>
                        <td><div align="center"><%= count++ %></td>
                        <td><s:property value="#approve.employee.name"/></td>
                        <td><s:property value="#approve.employee.typeName"/></td>
                        <td><s:property value="#approve.app_date"/></td>
                        <td><s:property value="#approve.passedName"/></td>
                    </tr>
         </s:iterator>
    </table>
    <table style="width:850px" align="center" cellpadding="0" cellspacing="1" class="resultTableFooter">
      <tr>
        <td width="2%" align="center"></td>
        <td width="44%" align="left"><div align="left"><span class="STYLE31"></span></div></td>
      </tr>
    </table>
	
    <p align="center">
	  <input type="submit" class="button" value="修  改" "></input>
	  <input type="button" class="button" value="返  回" onClick="back();"></input>
    </p>
  </form>
</body>
</html>
