<%@page import="com.lin.bean.Person"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("lin", 23);
request.setAttribute("lee", 24);
%>
${pageScope.lin} <!-- 获取作用域中的值  -->
${requestScope.lee}



<% String[]arr= {"a","b","c","d"};
pageContext.setAttribute("lin", arr);
%>
${pageScope.lin[0]}
${lin[1] }<!-- 取出数组中的值   不写域名的话会在四个中依次寻找 -->



<%
Map m= new HashMap();
m.put("lin", 21);
m.put("lee", 22);
m.put("hong", "深圳");
m.put("address.aa", "深圳");
pageContext.setAttribute("map", m);
%>

${map.lin}
${map.lee}
${map.hong}
${map["address.aa"] }<!--当key带有点的时候 要用这种格式 去除集合中的值  -->

<%

Person p = new  Person(23,"lin");
request.setAttribute("o", p);
%>
${o.name}
${o.age }<!-- 获取自定义对象的属性值 -->
</body>
</html>