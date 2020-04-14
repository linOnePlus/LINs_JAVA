<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//得到session域中的名字
window.onload = function () {
	var myName = '<%=session.getAttribute("username")%>';
	if(myName==null||myName=="null"){
	}else{
		//将超链接的属性置空
		$("#login_text").text("欢迎："+myName).removeAttr('href');
		
	}
}
	

</script>
</head>
<body>
	<!-- logo部分 -->
	<nav class="navbar navbar-btn" role="navigation">
		<div class="container-fluid">
			<ul class="nav navbar-nav navbar-left">
				<li><a href="#"><span class="glyphicon glyphicon-globe"></span>
						Mytrip</a></li>
				<li><a href="#" style="color: royalblue;">热门景点</a></li>
				<li><a href="#" style="color: royalblue;">驴友评论</a></li>
				<li><a href="#" style="color: royalblue;">发布景点</a></li>


			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="index.jsp"><span
						class="glyphicon glyphicon-home"></span> 首页</a></li>
				<li><a href="regist.jsp"><span
						class="glyphicon glyphicon-user"></span> 注册</a></li>
				<li><a href="login.jsp"><span
						class="glyphicon glyphicon-log-in" id="login_text"></span> 登录</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-earphone"></span>
						联系我们</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>