<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>林氏学生资产管理系统登陆界面</title>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	//查一下AJAX跳转到新页面的方法 
	//1.用jQuery ajax方法来解决
	$(function(){
				$("#tj").click(function(){
					var username = $("#username").val();//取值
					var password = $("#password").val();
					if(!username){
						alert("用户名必填!");
						$("#username").focus();//获取焦点
						return ;
					}
					if(!password){
						alert("密码必填!");
						$("#password").focus();//获取焦点
						return ;
					}
					//var param = "username="+username+"&password="+password;  
					var param = {"username":username,"password":password}; 
					$.post("LoggingServlet",param,function(result){
						//alert(typeof result)   搞半天原来后台传过来的值是String类型
						 if(result=="true"){
							window.location.href="index.jsp";	
						}else{
							alert("用户名或者密码错误!");
					     }
						});
				});
			});

	</script>



<style type="text/css">
body {
	font-family: Microsoft YaHei;
	color: black;
}

.tj {
	font-family: Microsoft YaHei;
	width: 50px;
	height: 25px;
	font-size: 13px;
}
</style>

</head>
<body>
	<p>
	<h1 align="center">欢迎访问学生管理系统</h1>
	</p>
	<%--  <input type="text" style="display:none"  value="${result}" id="jd"/><!--隐藏的标签来接受Servlet传过来的值  --> --%>
	<form align="center" method="post">
		<table width=270 height=100 align="center">

			<tr>
				<td>用户名：</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>


			<tr>
				<td>密 &nbsp;&nbsp;码：</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
		</table>
		<br /> <input type="button" value=" 登陆" class=" tj" id="tj" />
		<!--登陆按钮-->
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="register.jsp"
			target="_self "> <input type="button" value="注册" class=" tj" />
			<!--注册按钮，并打开连接-->
		</a>


	</form>

</body>
</html>