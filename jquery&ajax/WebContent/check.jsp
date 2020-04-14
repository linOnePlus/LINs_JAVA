<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
function check(){
//获取提交上来的用户名
var name =$("#username").val();

//发送请求
$.post("CheckUsernameServlet",{name:name},function(data,status){
	alert(data)
	if(data>0){
		$("#span1").html("对不起。用户名已经被注册");
	}else{
		$("#span1").html("可以");
	}
});
}
</script>
</head>
<body>
<form action="CheckUsernameServlet" method="post">
用户名：<input type ="text" name ="username" id="username" onblur="check()"><span id = "span1"></span>
<input type = "submit" value="提交">
</form>
</body>
</html>