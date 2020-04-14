<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 导包  Jar-->
    <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set  var="mingzi"  value="linzejia"  scope="session"></c:set>
<!-- 1.设置一个name对象 赋值为 linzejia  存在SESSION域中 -->
${sessionScope.mingzi}
<br>


<c:set   var="age" value="20" scope="application"> </c:set>
<!-- 2.判断test里表达式的Boolean值  ture则执行标签里的内容 并且赋值给result 存在page域中 -->
<c:if test="${applicationScope.age>18}"  var="result"  scope="page">
<font color="red" size="50">成年了</font>
</c:if>
${pageScope.result }
<br>




<c:forEach var="i" begin="1" end="10" step="2" >
${i }
</c:forEach>
<br/>

<!-- 遍历集合 item必须写el表达式  var 表示遍历出来的值用什么去装 -->
<%
List list = new  ArrayList();
list.add(20);
list.add(30);
list.add(40);
pageContext.setAttribute("list", list);
%>
<c:forEach var="jihe" items="${list}">
${jihe}
</c:forEach>

</body>
</html>