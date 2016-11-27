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
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;活动信息管理 &gt;&gt; 活动明细及审批</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>
  <form name="form1" method="post" action="list.html" class="myForm">
    <h5 align="center" class="STYLE36">活动详细信息</h5>
    <table width="742" align="center" cellpadding="0" cellspacing="0" class="searchTable" style="width:850px" >
      <tr>
        <td bgcolor="#F6F6F6">活动标题</td>
        <td colspan="3"><div align="left">组织十渡两日游</div></td>
        <td bgcolor="#F6F6F6">活动经费</td>
        <td width="201">￥3000.0</td>
      </tr>
      <tr>
        <td width="71" bgcolor="#F6F6F6">开始时间</td>
        <td width="185">2011-10-01</td>
        <td width="64" bgcolor="#F6F6F6">结束时间</td>
        <td width="244" >2011-11-15</td>
        <td width="83" bgcolor="#F6F6F6">创建时间</td>
        <td>2011-08-18 15:23:50</td>
      </tr>
      <tr>
        <td width="71" bgcolor="#F6F6F6">活动状态</td>
        <td colspan="5">财务出纳审核通过</td>
      </tr>	 
	  <tr>
        <td bgcolor="#F6F6F6">活动描述</td>
        <td colspan="5"><div align="left">十渡是距首都最近、北方独特、华北地区最大、最典型的岩溶峰林峡谷，有天然石佛、飞来石、一线天、龙山“佛” 字、水往高处流、石中石等12大地质奇观，享有“青山野渡，百里画廊”之美誉。

</div></td>
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
      <tr>
        <td><div align="center">1</div></td>
        <td>Mary</td>
        <td>财务出纳</td>
        <td>2011-08-20 10:23:50</td>
        <td>同意申请</td>
      </tr>
    </table>
    <table style="width:850px" align="center" cellpadding="0" cellspacing="1" class="resultTableFooter">
      <tr>
        <td width="2%" align="center"></td>
        <td width="44%" align="left"><div align="left"><span class="STYLE31"></span></div></td>
      </tr>
    </table>

    <h5 align="center" class="STYLE36">财务审批</h5>
	
    <table width="742" align="center" cellpadding="0" cellspacing="0" class="searchTable" style="width:850px" >
      <tr>
        <td width="81" bgcolor="#F6F6F6">审批操作</td>
        <td colspan="3"><div align="left"><span class="altbg1">
            <input name="passed" type="radio" value="">同意
			<input name="passed" type="radio" value="">不同意
        </span> </div></td>
        <td width="56" bgcolor="#F6F6F6">审批意见</td>
        <td width="552"><textarea name="textarea" cols="80" rows="1"></textarea></td>
      </tr>
    </table>
    <p align="center">
	  <input type="button" class="button" value="确  定" onClick="to('cashier_activity_list.html');"></input>&nbsp;
	  <input type="button" class="button" value="返  回" onClick="back();"></input>
    </p>
  </form>
</body>
</html>
