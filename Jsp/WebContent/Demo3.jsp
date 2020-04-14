<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:forward page="Demo2.jsp">
<jsp:param value="zejia" name="LIN"/>
</jsp:forward><!--跳转 同时能传参数 传中文参数不懂 -->
<%
request.getRequestDispatcher("Demo2.jsp").forward(request, response);
%>
</body>
</html>