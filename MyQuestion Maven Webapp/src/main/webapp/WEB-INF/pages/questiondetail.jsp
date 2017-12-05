<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'questiondetail.jsp' starting page</title>
    
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
    	<center>
			 <div>
			 	<table border="0" cellpadding="0" cellspacing="0">
			 		<tr>
			 			<td>问题：</td>
			 			<td>${question.title }</td>
			 		</tr>
			 		<tr>
			 			<td>问题描述：</td>
			 			<td>${question.detailDesc }</td>
			 		</tr>
			 		<tr>
			 			<td>网友回答：</td>
			 			<td></td>
			 		</tr>
			 		<c:forEach items="${question.answers }" var="a">
			 			<tr>
			 				<td>
			 					<fmt:formatDate value="${a.ansDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
			 				</td><br/>
			 				<td>${a.ansContent }</td>
			 			</tr>
			 		</c:forEach>
			 	</table>
			 </div>
 		</center>
 		
 		<center>
		    <form action="answer/save/${question.id }" method="post" id="form" >
		   
			    <table border="0" cellpadding="0" cellspacing="0">
			    	<tr>
			    		<td>我来回答：</td>
			    		<td><textarea id="ansContent" name="ansContent" value=""></textarea></td>
			    	</tr>
			    	
			    	<tr>
			    		<td colspan="2" align="center"><button type="button" id="btn1">提交答案</button>&nbsp
			    		<a href="question/findAll">返回首页</a></td>
			    	</tr>
			    </table>
			
		    </form>
    	</center>
    
    
     <script type="text/javascript" src="statics/js/jquery-1.8.3.js"></script>
   <script type="text/javascript">
   	$(document).ready(function(){
   		$("#btn1").click(function(){
   			var flag=true;
   			var $ansContent=$("#ansContent");
   			if($ansContent.val()==""){
   				alert("必须填写您的答案！");
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
