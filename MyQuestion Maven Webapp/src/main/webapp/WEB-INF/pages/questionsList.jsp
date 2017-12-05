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
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		*{
		margin:0px;
		padding:0px;
		}
		
		table{
		margin:50px;
		}
		
		.colour{
		background:pink;
		}
		
		
	</style>

  </head>
  		
  <body>
  
  <center><h1>在线问答！</h1></center><br>
  <center><h2><a href="question/add">我要提问！</a></h2></center><br>
  <center>
	 <div>
	 	<table border="1" cellpadding="0" cellspacing="0">
	 	<tbody>
	 		<tr>
	 			<td>编号</td>
	 			<td>问题</td>
	 			<td>回答次数</td>
	 			<td>最后修改时间</td>
	 		</tr>
	 		
	 		<c:forEach items="${questionList }" var="q" varStatus="status">
		 		<tr <c:if test="${status.count%2==0 }">class="colour"</c:if>>
		 			<td>${q.id }</td>
		 			<td>
			 			<a href="question/findById/${q.id }"
				 			<c:if test="${q.answers.size()==0 }">
				 				style="color:red"
				 			</c:if>>
			 				${q.title }
			 			</a>
		 			</td>
		 			<td>${q.answers.size() }</td>
		 			<td><fmt:formatDate value="${q.lastModified}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
		 		</tr>
	 		</c:forEach>
	 	</tbody>
	 	</table>
	 </div>
 </center>
  </body>
</html>
