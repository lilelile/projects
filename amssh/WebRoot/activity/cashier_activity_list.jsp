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
  <title>活动信息管理</title>
  <script language="JavaScript" src="../js/common.js"></script>
  <script language="JavaScript" src="../js/sortTable.js"></script>
  <link href="../css/main.css" rel="stylesheet" type="text/css">
</head>

<body>
  <table width="100%" align="center" cellpadding="0" cellspacing="0" class="currentPosition">
    <tr>
      <td width="6" height="22" background="../images/main_top01.gif"></td>
      <td width="1033" background="../images/main_top02.gif">&nbsp;&nbsp;当前位置:&nbsp;&nbsp;活动信息管理 &gt;&gt; 等待审核活动列表</td>
      <td width="6" height="22" background="../images/main_top03.gif">&nbsp;</td>
    </tr>
  </table>

  <form name="form1" method="post" action="" class="myForm">
    <table style="width:900px" align="center" cellpadding="0" cellspacing="0" class="resultTable" id="sortable">
      <tr>
        <th width="3%" height="27"><div align="center">序号</div></th>
        <th width="10%">员工姓名</th>        
        <th width="37%">活动标题</th>
        <th width="11%">活动经费</th>        
        <th width="10%">活动开始时间</th>
        <th width="10%">活动结束时间</th>        
        <th width="8%">活动状态</th>
        <th width="11%">操作</tr>
      <tr>
        <td><div align="center">1</div></td>
        <td>Tom</td>
        <td>组织香山一日游</td>
        <td>￥1000.0</td>
        <td>2011-10-10</td>
        <td>2011-11-15</td>
        <td>新创建</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>	
      <tr>
        <td><div align="center">2</div></td>
        <td>Tom</td>
        <td>组织十渡两日游</td>
        <td>￥3000.0</td>
        <td>2011-07-10</td>
        <td>2011-08-15</td>
        <td>新创建</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>
      <tr>
        <td><div align="center">3</div></td>
        <td>Tom</td>
        <td>北戴河两日游</td>
        <td>￥5000.0</td>
        <td>2011-07-10</td>
        <td>2011-09-10</td>
        <td>新创建</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>
      <tr>
        <td><div align="center">4</div></td>
        <td>Jack</td>
        <td>周末篮球比赛</td>
        <td>￥500.0</td>
        <td>2011-08-10</td>
        <td>2011-09-20</td>
        <td>新创建</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>
      <tr>
        <td><div align="center">5</div></td>
        <td>Mike</td>
        <td>青岛三日游</td>
        <td>￥20000.0</td>
        <td>2011-09-10</td>
        <td>2011-10-20</td>
        <td>新创建</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>
      <tr>
        <td><div align="center">6</div></td>
        <td>Jack</td>
        <td>夏威夷阳光之旅</td>
        <td>￥100000.0</td>
        <td>2011-10-01</td>
        <td>2011-11-15</td>
        <td>再次提交</td>
        <td><a href="cashier_activity_info.html">查看明细</a></td>
      </tr>
    </table>
    <table style="width:900px" align="center" cellpadding="0" cellspacing="1" class="resultTableFooter">       
    </table>
    <table align="center" class="myForm">
      <tr>
        <td>
          <div class="button_bar" align="center">
          <input type="button" class="button" value="返  回" onClick="back();"></input>
          </div>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
