<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	 
%>
<!DOCTYPE html>
<html>
	<head>
		<title>图书管理系统</title>

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
		<script type="text/javascript">
/**
 * 根目录
 */
var context = "<%=request.getContextPath()%>" + "/";
</script>

	</head>

	<body>
		<div class="navbar navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid">
					<a class="btn btn-navbar" data-toggle="collapse"
						data-target=".nav-collapse"> <span class="icon-bar"></span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> </a>
					<a class="brand" href="index.jsp">图书管理系统</a>
					<div class="nav-collapse collapse">

						<c:if test="${not empty reader}">
						
						<ul class="nav">
							<li>
								<a href="index.jsp">首页</a>
							</li>
							<li>
								<a href="reader_borrow.jsp">借阅管理</a>
							</li>
						</ul>
						
						</c:if>


						<ul class="nav pull-right">
						
						
							<li>
								<a href="admin.jsp">管理员入口</a>
							</li>
							
							
							<c:if test="${empty reader}">
							
							<li>
								<a onclick="login()" class="hand"  >登录</a>
							</li>
							<li>
								<a onclick="register()"  class="hand"  >注册</a>
							</li>
							
							</c:if>
						
						
						<c:if test="${not empty reader}">
						
							<li>
								<a role="button" class="dropdown-toggle" data-toggle="dropdown">
									<i class="icon-user"></i> ${reader.name} </a>
							</li>
							<li>
								<a id="logoutBtn2"> 退出 </a>
							</li>
						</c:if>	
							
						</ul>

					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>



		<div class="container-fluid">
			<div class="row-fluid">