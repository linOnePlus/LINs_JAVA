<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新学生信息界面</title>
</head>
<body>
	<form action="UpdateServlet" method="post">
		<input type="hidden" name="sid" value="${stu.sid }">
		<!--value值要小心不要加多了个空格 读可能出错  -->
		<table border="2px soild blue" width="70%" align="center">
			<tr>
				<td>姓名</td>
				<td><input type="text" name="sname" value="${stu.sname }" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<%-- 	<c:if test="${stu.gender=='男' }">checked</c:if>   为input标签赋予checked属性--%>
				<td><input type="radio" name="gender" value="男"
					<c:if test="${stu.gender=='男' }">checked</c:if> />男 <input
					type="radio" name="gender" value="女"
					<c:if test="${stu.gender=='女' }">checked</c:if> />女</td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone" value="${stu.phone }"></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="date" name="birthday" value="${stu.birthday }"></td>
			</tr>
			<tr>
				<td>爱好</td>
				<%--<c:if test="${fn:contains(stu.hobby,'唱') }">checked</c:if> 判断有没有包含对应爱好的字符串--%>
				<td><input type="checkbox" name="hobby" value="唱"
					<c:if test="${fn:contains(stu.hobby,'唱') }">checked</c:if>>唱
					<input type="checkbox" name="hobby" value="跳"
					<c:if test="${fn:contains(stu.hobby,'跳') }">checked</c:if>>跳
					<input type="checkbox" name="hobby" value="rap"
					<c:if test="${fn:contains(stu.hobby,'Rap') }">checked</c:if>>Rap
					<input type="checkbox" name="hobby" value="篮球"
					<c:if test="${fn:contains(stu.hobby,'篮球') }">checked</c:if>>篮球
					<input type="checkbox" name="hobby" value="学习"
					<c:if test="${fn:contains(stu.hobby,'学习') }">checked</c:if>>学习</td>
			</tr>
			<tr>
				<td>简介</td>
				<td><textarea rows="3" cols="20" name="info">"${stu.info }"</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认更新"></td>

			</tr>
		</table>
	</form>
</body>
</html>