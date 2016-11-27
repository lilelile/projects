<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> 
<html>  
 <head>      
   <title>修改电影订单信息界面</title>   
   <form action="fhdxiugai" method="post"> 
<center><table>
		<tr>
		<th>编号:&nbsp;&nbsp;</th><th><input  type="text" name="id"  /></th>
		</tr>
</center></table>
<br>
<center><table>
		<tr><th>电&nbsp;&nbsp;影&nbsp;&nbsp;</th><th><input name="film" type="text" /></th>
		</tr>
</center></table>
<br>
<center><table>
		<tr><th>类&nbsp;型&nbsp;&nbsp;</th><th><input name="type" type="type"  /></th>
		</tr>
</center></table>
<br>
<center><table>
		<tr><th>上映&nbsp;日期&nbsp;&nbsp;</th><th><input name="date" type="text"   /></th>
		</tr>
</center></table>	
		<br>
		<center><table>
		<tr><th>选择&nbsp;座位&nbsp;&nbsp;</th><th><input name="seat" type="seat"   /></th>
		</tr>
</center></table>	
		<br>
<center><table>
		<tr>
		<th>所需&nbsp;费用&nbsp;</th><th><input  type="cost" name="cost"  /></th>
		</tr>
</center></table>
        <br><br>
	
	
<br>	<center>
 <input type="submit" value="提交"/>    </center>
</form> 
  </body> 
</html>
