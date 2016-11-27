<%@ page language="java" contentType="text/html; charset=gb2312"
    pageEncoding="gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>首页界面</title>
<style type="text/css">   
#container{
        width:1340px;
       
    }   
     #header{
       height:200px;
       width:1330px;
       border:1px solid gray;
       background:#BBFFBB;
       background-position:center;
       background-repeat: no-repeat;
       background-image: url(./111.jpg)    }
    #footer{
       height:480px;
       width:1330px;
       border:1px solid gray;
       background:#FFD9EC;
       float:left;    }
     .three{
        height:470px;
        width:430px;
        background:white;
        margin:5px;
        float:left;
    }
     .three img{
       float:left;
    }
     #nav li{
       background:#D0D0D0;
       width:90px;
       margin-left:25px;
 margin-top:10px;
 
     }     #nav a{
       font-size:30px/47px;
       font-family:Georgia, "Times New Roman", Times, serif; 
       color:#363636;
       display:black;
       width:90px;
       height:37px;
       text-align:center;
    }
    #nav a:hover{
       color:white;
       background:orange;
    }    






</style>

</head>
    <body>
<div id="container">   
    		<div id="header">
                <p align="center" >
                    <font color="black" face="微软雅黑" size="15" >哈尔滨理工大学图书管理系统</font>
                </p>      
            </div>
       
        
       <div id="footer">
          <div class="three">
              <img src="./img/11.png" alt=""  />              <ul id="nav">
<li><a href="http://localhost:8080/tushuguanli/guanliyuan.jsp">管理员信息</a></li>          </ul>
                        </div>
          <div class="three">
              <img src="./img/22.png" alt=""  />              <ul id="nav">
              <li><a href="duzhe.html">读者信息</a></li>
              <li><a href="tushu.html">图书信息</a></li>
              </ul>          
          </div>
          <div class="three">
              <img src="./img/33.png" alt=""  />              <ul id="nav">
              <li><a href="jieshu huan shu.html">图书借阅</a></li>
              <li><a href="jieshu huan shu.html">图书归还</a></li>
              </ul>      
          </div>
         
          
       </div>

       </div>   
     </body>