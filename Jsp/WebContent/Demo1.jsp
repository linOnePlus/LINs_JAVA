<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  session="true"%>
    <%@include file ="Demo2.jsp" %> <!-- 引入其他JSp文件 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>这是Demo1的内容</h1>
<jsp:include page="Demo2.jsp"></jsp:include><!-- 这里引入Jsp页面的运行结果 不是所有代码都COPY进来 -->


</body>
</html>