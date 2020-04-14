<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这是Demo2的内容</h1>
<%-- <%=request.getParameter("LIN") %> --%>
<% System.out.print(new String(request.getParameter("LIN").getBytes("ISO-8859-1"),"UTF-8")); %>
</body>
</html>