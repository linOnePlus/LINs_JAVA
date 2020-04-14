<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
		<link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />

		<!-- 还需要引入JQuery -->
		<script src="../jquery-3.3.1.js" type="text/javascript" charset="utf-8"></script>

		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="../js/bootstrap.js" type="text/javascript" charset="utf-8"></script>

		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		
		<link rel="stylesheet" type="text/css" href="../css/login.css"/>
		
	</head>
	<body>
		<form action="UserServlet" method="post">
			<div class="container">
				<!-- logo部分 -->
				<nav class="navbar navbar-btn" role="navigation">
					<div class="container-fluid">
						<div class="nav navbar-nar navbar-left">
							<li><a href="#"><span class="glyphicon glyphicon-globe"></span> Mytrip</a></li>
						</div>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="index.jsp"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
							<li><a href="regist.jsp"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
							<li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
							<li><a href="#"><span class="glyphicon glyphicon-earphone"></span> 联系我们</a></li>
						</ul>
					</div>
				</nav>
				<!-- 登录界面 -->
				<div class="form row ">
					<div class="form-horizontal col-md-offset-2" id="login_form">
						<h3 class="form-title">欢迎登录</h3>
						<div class="col-md-9">
							<div class="form-group">
								<i class="glyphicon glyphicon-user fa-lg"></i>
								<input class="form-control required" type="text" placeholder="请输入用户名..." id="username" name="username" autofocus="autofocus"
								 maxlength="20" />
								<span id="checkUserNameResult" style="color: red "></span>
							</div>
							<div class="form-group">
								<i class="glyphicon glyphicon-lock fa-lg"></i>
								<input class="form-control required" type="password" placeholder="请输入密码..." id="password" name="password"
								 maxlength="8" />
								<span id="checkPasswordResult" style="color: red "></span>
								<label class="control-label" for="inputSuccess1" style="color: red;" id="message"></label>
							</div>
							<div class="form-group col-md-offset-9">
								<button type="submit" class="btn btn-success pull-left" name="login" id="login">登录</button>
								<button type="button" class="btn btn-danger pull-right" name="register" id="register" data-toggle="modal"
								 data-target="#myModal">注册</button>
							</div>
						</div>
					</div>
				</div>
		</form>
		
	</body>
</html>
