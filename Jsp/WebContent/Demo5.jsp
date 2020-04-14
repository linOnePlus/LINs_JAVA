<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 测试四个作用域的区别 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println(pageContext.getAttribute("lin"));
out.println(session.getAttribute("lee"));
out.println(request.getAttribute("chen"));
out.print(application.getAttribute("hong"));
%>
</body>
</html>