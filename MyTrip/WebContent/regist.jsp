<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<meta charset="utf-8">
<title>Mytrip</title>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" type="text/css" href="/MyTrip/css/bootstrap.css" />

<!-- 还需要引入JQuery -->
<script src="/MyTrip/js/jquery-3.3.1.js" type="text/javascript"
	charset="utf-8"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="/MyTrip/js/bootstrap.js" type="text/javascript"
	charset="utf-8"></script>

<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<script src="/MyTrip/js/regist.js" type="text/javascript"
	charset="utf-8"></script>	
<link rel="stylesheet" type="text/css" href="/MyTrip/css/regist.css" />
</head>
<body>
	<form action="registServlet" method="post">
		<div class="container">
			<!-- logo部分 -->
			<!-- 用include引入头 -->
				<jsp:include page="/jsp/logo.jsp"></jsp:include>
			<div id="bg">
				<!-- 注册框 -->
				<div class="form row">
					<div class="form-horizontal col-md-offset-2" id="regist_form">
						<h3 class="form-title">欢迎注册</h3>
						<div class="col-md-9">
							<div class="form-group">
								<i class="glyphicon glyphicon-user fa-lg"></i> <input
									class="form-control required" type="text"
									placeholder="请输入用户名..." id="username" name="username"
									autofocus="autofocus" maxlength="20" /> <span
									id="checkUserNameResult" style="color: red"></span>
							</div>


							<div class="form-group">
								<i class="glyphicon glyphicon-lock fa-lg"></i> <input
									class="form-control required" type="password"
									placeholder="请输入密码..." id="password" name="password"
									autofocus="autofocus" maxlength="20" /> <span
									id="checkPasswordResult" style="color: red"></span>
							</div>


							<div class="form-group">
								<i class="glyphicon glyphicon-lock fa-lg"></i> <input
									class="form-control required" type="password"
									placeholder="请再次输入密码..." id="repassword" name="repassword"
									autofocus="autofocus" maxlength="20" /> <span
									id="checkRePasswordResult" style="color: red"></span>
							</div>


							<div class="form-group">
								<i class="glyphicon glyphicon-earphone fa-lg"></i> <input
									class="form-control required" type="phone"
									placeholder="请输入电话..." id="phone" name="phone"
									autofocus="autofocus" maxlength="20" /> <span id="checkPhone"
									style="color: red"></span>
							</div>


							<div class="form-group">
								<i class="glyphicon glyphicon-envelope fa-lg"></i> <input
									class="form-control required" type="email"
									placeholder="请输入邮箱..." id="email" name="email"
									autofocus="autofocus" maxlength="20" /> <span id="checkEmail"
									style="color: red"></span>
							</div>
							<div class="form-group col-md-offset-9">
								<button type="submit" class="btn btn-danger center-block"
									name="register" id="register" data-toggle="modal"
									data-target="#myModal">注册</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>