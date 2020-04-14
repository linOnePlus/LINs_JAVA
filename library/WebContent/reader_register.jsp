<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page
	import="java.util.*,java.io.*,javax.servlet.*,javax.servlet.http.*,java.lang.*"%>
<%@ page import="com.dao.*,com.model.*,com.model.Reader"%>
<%
	Object Object = request.getSession().getAttribute("reader");
	if (null != Object) {
		response.sendRedirect("index.jsp");
	}
	 
%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="renderer" content="webkit|ie-comp|ie-stand">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport"
			content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<title>注册</title>
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
			media="screen">
		<link href="bootstrap/css/bootstrap-responsive.min.css"
			rel="stylesheet" media="screen">
		<link href="assets/styles.css" rel="stylesheet" media="screen">
		<link href="assets/DT_bootstrap.css" rel="stylesheet" media="screen">
		<!--[if lt IE 9]>
      		<script src="http://cdn.bootcss.com/html5shiv/r29/html5.min.js"></script>
    	<![endif]-->
		<script src="vendors/modernizr-2.6.2-respond-1.1.0.min.js">
</script>

		<script src="vendors/jquery-1.9.1.min.js">
</script>
		<script src="bootstrap/js/bootstrap.min.js">
</script>

		<script src="js/Validform_v5.3.2_min.js" charset="utf-8"
			type="text/javascript">
</script>

		<script src="vendors/datatables/js/jquery.dataTables.min.js">
</script>
		<script src="assets/DT_bootstrap.js">
</script>

	</head>
	<body id="login">
		<div class="container">

			<form class="form-signin" action="controller" method="post">
				
				<input type="hidden" name="oper" value="register" />
				
				<center>
					<h2 class="form-signin-heading">
						注册-图书管理系统
					</h2>
				</center>
					<input type="text" class="input-block-level" name="username"
					datatype="*1-10" nullmsg="账号不能为空" placeholder="账号">
				<input type="password" class="input-block-level" name="password"
					datatype="*3-10" nullmsg="密码不能为空" placeholder="密码">
				
				<input type="password" class="input-block-level" name="repassword"
					 datatype="*" recheck="password" nullmsg="请再输入一次密码！" errormsg="您两次输入的账号密码不一致！"  placeholder="确认密码">
				<input type="text" class="input-block-level" name="name"
					datatype="*1-10" nullmsg="姓名不能为空" placeholder="姓名">
				<input type="text" class="input-block-level" name="num"
					datatype="n3-6" nullmsg="学号不能为空" placeholder="学号">

				<center>
					<button class="btn btn-large btn-primary" type="submit">
						注册
					</button>
					<br>
					<br>
					<a href="reader_login.jsp">已有账号，去登录</a>
				</center>
			</form>

		</div>
		<!-- /container -->

<script src="vendors/layer/layer.js"></script>
		<script>

$(function() {
	
		$(".form-signin").Validform( {
			tiptype : 4,
			ajaxPost : true,
			callback : function(data) {
				if (data.code == 1) {
					layer.msg(data.msg);
				} else {
					window.top.location.reload();
				}
			}
		});
});
</script>

	</body>
</html>

