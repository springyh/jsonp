<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(function(){
		$("#uname").blur(function(){
			var unamevalue = $("#uname").val();
			$.ajax({
				url:"selName",
				type:"post",
				data:{"uname":unamevalue},
				dataType:"json",
				success:function(data){
					 if(data.status ==200){
						 $("#unameSpan").html("<th style='color:red;'>名字重复</th>");
					 }else{
						 $("#unameSpan").html("<th style='color:green;'>名字可以使用</th>");
					 }
				}
			});
		});
	});
</script>
</head>
<body>
	 <form action="${pageContext.request.contextPath }/registers" method="post">
	 	姓名:<input type="text" name="uname" id="uname" value=""/><span id="unameSpan"></span><br>
	 	密码:<input type="password" name="password" id="password" value=""/><br>
	 	车辆名字:<input type="text" name="cname" id="cname" value=""/><br>
	 	车辆颜色:<input type="text" name="color" id="color" value=""/><br>
	 	时间:<input type="text" name="drivertime" id="drivertime" value=""/><br>
	 	地址:<input type="text" name="aname" value="" id="aname"/><br><span id="anameSpan">
	 	<input type="submit" value="提交"/>
	 </form>
	${map.get("mess") }
</body>
</html>