<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'questionadd.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center><h1>我要提问</h1></center><br>
  	<center><h2><a href="question/findAll">返回首页！</a></h2></center><br>
  	
  	
   <center>
    <form action="question/save" method="post" id="form" >
   
	    <table border="1" cellpadding="0" cellspacing="0">
	    	<tr>
	    		<td>问题：</td>
	    		<td><input type="text" id="title" name="title" value=""/></td>
	    	</tr>
	    	
	    	<tr>
	    		<td>问题描述：</td>
	    		<td><textarea id="detailDesc" name="detailDesc" value=""></textarea></td>
	    	</tr>
	    	
	    	<tr>
	    		<td colspan="2" align="center"><button type="button" id="btn1">保存问题</button></td>
	    		
	    	</tr>
	    </table>
	
    </form>
    </center>
    
    
   <script type="text/javascript" src="statics/js/jquery-1.8.3.js"></script>
   <script type="text/javascript">
   	$(document).ready(function(){
   		$("#btn1").click(function(){
   			var flag=true;
   			var $title=$("#title");
   			if($title.val()==""){
   				alert("必须填写问题！");
   				return false;
   			}
   			if(flag){
   				$("#form").submit();
   			}
   		});
   	});
   
   </script>
  </body>
</html>
