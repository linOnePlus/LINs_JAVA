<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加学生界面</title>
</head>
<body>
	<form action="AddServlet" method="post">
		<table border="2px soild blue" width="70%" align="center">
			<tr>
				<td>姓名</td>
				<td><input type="text" name="sname" required /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><input type="radio" name="gender" value="男" />男 <input
					type="radio" name="gender" value="女" />女</td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="date" name="birthday" required="required"></td>
			</tr>
			<tr>
				<td>爱好</td>
				<td><input type="checkbox" name="hobby" value="唱">唱 <input
					type="checkbox" name="hobby" value="跳">跳 <input
					type="checkbox" name="hobby" value="Rap">Rap <input
					type="checkbox" name="hobby" value="篮球">篮球 <input
					type="checkbox" name="hobby" value="学习">学习</td>
			</tr>
			<tr>
				<td>简介</td>
				<td><textarea rows="3" cols="20" name="info"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="确认添加"></td>

			</tr>
		</table>
	</form>
</body>
</html>