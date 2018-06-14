<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
	<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			$.ajax({
				url:'http://localhost:8081/demo',
				type:'POST',
				dataType:'jsonp',//指定服务器返回的数据类型
				jsonp:'theFunction', //指定参数名称
				jsonpCallback:'showData',//指定回调函数名称
				success:function(data){
					alert("success:"+data.age);
				}
			});
		});
	});
	</script>
  </head>
  
  <body>
    <button>发送ajax请求jsonp</button>
  </body>
</html>
