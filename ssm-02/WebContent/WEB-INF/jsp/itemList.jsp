<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
$(function(){
	//alert(1);
	var params = '{"id": 1,"name": "测试商品","price": 99.9,"detail": "测试商品描述","pic": "123456.jpg"}';
	$.ajax({
		url:"${pageContext.request.contextPath }/json.action",
		data:params,
		contentType:"application/json;charaset=utf-8",//发送数据的格式
		type:"post",
		dataType:"json",
		success:function(data){
			alert(data.name);//测试responsebody发送来的json数据起作用了没
		}
	});
	
	})
</script>
</head>
<body> 
<form action="${pageContext.request.contextPath }/item/queryitem.action" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td><input type="submit" value="查询"/></td>
</tr>
</table>
</form>
商品列表：
<form action="${pageContext.request.contextPath }/testlist.action" method="post">
<table width="100%" border=1>
<tr>
	
	<td>选择</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
<c:forEach items="${itemList}" var="item" varStatus="s">
<tr>
	<td>
	<input type="checkbox"  name="ids" value="${item.id}">
	</td>
    <td>
	<input type="hidden" name="itemList[${s.index}].id" value="${item.id }"/>
	<input type="text" name="itemList[${s.index}].name" value="${item.name}"/>
	</td>
	<td><input type="text" name="itemList[${s.index}].price" value="${item.price}"/></td>
	<td><input type="text" name="itemList[${s.index}].createtime" value="${item.createtime}"/></td>
	<td><input type="text" name="itemList[${s.index}].detail" value="${item.detail}"/></td>
	<td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.id}">修改</a></td>
</tr>
</c:forEach>
</table>
<input type="submit" value="test list">
<input type="submit" value="测试数组提交暂时作废">
<a href="${pageContext.request.contextPath }/testcontroller01.action" >测试croller返回值请求转发</a>
<a href="${pageContext.request.contextPath }/testcontroller02.action" >测试croller返回值重定向和发数据</a>
<br/>
<a href="${pageContext.request.contextPath }/testcontroller03.action">测试返回字符串式请求转发</a>
<a href="${pageContext.request.contextPath }/testcontroller04.action">测试返回字符串式重定向</a>
</form>
</body>

</html>