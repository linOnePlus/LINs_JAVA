<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp9个内置对象 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 4个作用域对象 -->
<%
pageContext.setAttribute("lin", 21);
session.setAttribute("lee", 22);
request.setAttribute("chen", 24);
application.setAttribute("hong", 22);
%>

<%
out.println(pageContext.getAttribute("lin"));
out.println(session.getAttribute("lee"));
out.println(request.getAttribute("chen"));
out.print(application.getAttribute("hong"));
%>

<%
/* 
 //测试PageContext的作用范围 只有本页面 这个是请求转发 同一次request对象
request.getRequestDispatcher("Demo5.jsp").forward(request, response);
 */ 
 //测试request的作用范围  只在一次请求中有效
 response.sendRedirect("Demo5.jsp");
 
 
%>
</body>
</html>