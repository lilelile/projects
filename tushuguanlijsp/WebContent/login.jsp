<%@ page language="java" import="java.sql.*" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>�û���¼����</title>
<style type="text/css">
  body{margin:0 auto; font-family:Georgia, 
    "Times New Roman", Times, serif; 
 background-image: url(./img/444.png);
    font-size:14px;
    background-color: #CCFF80;
    }
  .top{
    position: relative;
    left: 600px;
    top: 450px;
  }
  .login{
    /*background-color: #CCC;*/
    position: absolute;
    left: 200px;
    width: 300px;
    height: 570px;
   
  }
  .login1{
    position: relative;
    left: 650px;
    top: 450px;
  }//����
</style>
 <script language="javascript">
	function check(form){
		if(form1.adminname.value==""){
			alert("��������ȷ���û���");
      form1.adminname.focus();
      return false;
		}
		if(form1.password.value==""){
			alert("��������ȷ������");
      form1.password.focus();
      return false;
		}
	}
</script>

</head>

<body>
  <div class="login">
    <h1 class="top">�û���¼����</h1>
    <form name="form1" method="post" action="loginServlet">
      <div class="login1">
        �û���:&nbsp;&nbsp;<input name="name" type="text" /><br>
        <p></p>
        ��&nbsp;&nbsp;&nbsp;&nbsp;��:&nbsp;&nbsp;
        <input name="pwd" type="password" id="pwd" /><br>
        <p></p>
        <input name="adminlogin" type="submit" value="��½" />
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input name="reset" type="reset" value="ȡ��" />
      </div>
    </form>
  </div>
</body>
</html>