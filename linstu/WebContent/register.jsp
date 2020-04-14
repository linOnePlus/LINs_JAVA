<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册页面</title>
<!-- 引入外部JS文件，有用正则表达式校验逻辑 -->
<script type="text/javascript" src="js/regutils.js"></script>
<script type="text/javascript">
	function ajaxFunction() {
		var xmlHttp;
		try { // Firefox, Opera 8.0+, Safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try {// Internet Explorer
				xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					alert("your browser not support Ajax!");
				}
			}
		}

		return xmlHttp;
	}
	function checkUsernameAjax() {
		var username = document.getElementById("username").value;
		var request = ajaxFunction();
		request.open("POST", "CheckUsernameServlet", true);

		//发送数据
		request.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		request.send("username=" + username);

		//获取响应
		// alert(request.responseText);
		request.onreadystatechange = function() {
			if (request.readyState == 4 && request.status == 200) {
				// alert(request.responseText);
				var checkUsername = request.responseText;
				if (username.length < 6) {
					document.getElementById("usernameTips").innerHTML = "<font size='3' color='red'>用户名不符合长度要求</font>";
					return false;
				} else {
					if (checkUsername > 0) {
						document.getElementById("usernameTips").innerHTML = "<font size='3' color='red'>对不起 ，用户名已经被使用</font>";
						return false;
					} else {
						document.getElementById("usernameTips").innerHTML = "恭喜您,用户名可用";
					}
				}

			}
		}

	}
</script>
<style>
#waiceng {
	box-shadow: 10px 10px 15px black;
	border: 5px solid white;
	width: 70%;
	height: 600px;
	background-color: white; <!--
	position: absolute; -->
	top: 200px;
	margin-left: 15%;
}

#neiceng1 {
	font-family: "microsoft yahei";
	color: cornflowerblue;
	text-align: center;
	height: 130px;
}

#neiceng2 {
	font-family: "microsoft yahei";
	font-size: 20px;
	height: 450px;
	color: cornflowerblue;
}

input {
	height: 30px;
	width: 200px;
	font-family: "microsoft yahei";
	color: black;
	font-size: small;
}

#button {
	width: 130px;
	height: 35px;
	color: white;
	background-color: cornflowerblue;
	font-size: large;
}
</style>


<script>
	function showTips(spanid, msg) {
		var a = document.getElementById(spanid);
		a.innerHTML = msg;
	}
	function checkUsername() {
		var a = document.getElementById("usernameTips");
		var b = document.getElementById("username");
		if (b.value.length >= 6) {
			a.innerHTML = "您输入的用户名长度符合要求"
			return true;
		} else {
			a.innerHTML = "<font size='3' color='red'>您输入的用户名不符合要求</font>"
			return false;
		}
	}
	function checkPassword() {
		var a = document.getElementById("passwordTips");
		var b = document.getElementById("password");
		if (b.value.length >= 6) {
			a.innerHTML = "<font size='3'>你输入的密码可用</font>"
			return true;
		} else {
			a.innerHTML = "<font size='3' color='red'>您输入的密码不符合要求</font>"
			return false;
		}
	}
	function checkRepassword() {
		var a = document.getElementById("repasswordTips");
		var password = document.getElementById("password");
		var repassword = document.getElementById("repassword");
		if (password.value == repassword.value) {
			if (password.value == '') {//判断为密码的值是否为空
				a.innerHTML = "<font size='3' color='red'>请先输入密码</font>"
				return false;
			} else {
				a.innerHTML = "<font size='3'>通过</font>"
			}
		} else {
			a.innerHTML = "<font size='3' color='red'>您两次输入的密码不正确</font>"
			return false;
		}
	}
	function checkMail() {
		var a = document.getElementById("emailTips");//获取提示框元素
		var b = document.getElementById("email1");//获取用户输入框元素
		var res = checkEmail(b.value)//外部引入的JS文件 要求传一个字符串

		if (res == true) {
			a.innerHTML = "<font size='3'>您输入的邮箱正确</font>"
		} else {
			a.innerHTML = "<font size='3' color='red'>您输入的邮箱不正确</font>"
			return false;
		}

	}
	function checkTel() {
		var a = document.getElementById("telTips");
		var b = document.getElementById("tel");
		var res = checkMobile(b.value);
		if (res == true) {
			a.innerHTML = "<font size='3'>您输入的手机号合法</font>"
		} else {
			a.innerHTML = "<font size='3' color='red'>您输入的手机号不合法</font>"
			return false;
		}

	}
	//防止什么都没填直接提交上去了
	function checkForm() {
		return checkUsername() && checkPassword() && checkRepassword()
				&& checkMail() && checkTel()
	}
</script>
</head>
<body bgcolor="darkgray">
	<div id="waiceng">
		<div id="neiceng1">
			<br />
			<h1 align="center">用户注册界面</h1>
			<hr style="width: 80%; color: blue;" />
		</div>
		<div id="neiceng2">
			<form action="AddUsernameServlet" onsubmit=" return checkForm()">
				<table align="center">
					<tr>
						<td>用户名</td>
						<td><input type="text" placeholder="请输入用户名" id="username"
							name="username" onfocus="showTips('usernameTips','请输入六位以上用户名')"
							onblur="checkUsernameAjax()" onkeyup="checkUsername()" /> <span
							id="usernameTips"></span></td>
					</tr>
					<tr>
						<td>密码</td>
						<td><input type="password" placeholder="请输入密码" id="password"
							name="password" onfocus="showTips('passwordTips','请输入六位以上密码')"
							onblur="checkPassword()" onkeyup="checkPassword()" /> <span
							id="passwordTips"></span></td>
					</tr>
					<tr>
						<td>确认密码</td>
						<td><input type="password" placeholder="请再次输入密码"
							id="repassword" onfocus="showTips('repasswordTips','请再次输入密码')"
							onblur="checkRepassword()" onkeyup="checkRepassword()" /> <span
							id="repasswordTips"></span></td>
					</tr>
					<tr>
						<td>email</td>
						<td><input type="email" placeholder="请输入邮箱" id="email1"
							onfocus="showTips('emailTips','请正确输入邮箱')" onblur="checkMail()"
							onkeyup="checkMail()" /> <span id="emailTips"></span></td>
					</tr>
					<tr>
						<td>手机号</td>
						<td><input type="text" placeholder="请输入手机号" id="tel"
							onfocus="showTips('telTips','请输入你的手机号码')" onblur="checkTel()"
							onkeyup="checkTel()" /> <span id="telTips"></span></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="提交注册" id="button" /></td>
					</tr>
					</form>
					</div>
				</table>
		</div>
</body>
</html>
