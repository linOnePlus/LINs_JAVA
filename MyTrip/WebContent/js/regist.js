//定义一个全局变量：作来标记具体的是什么错误，如果这个变量 是0说明没有信息问题，可以注册
var a = "0";
var b = "0";
var c = "0";
var d = "0";
var e = "0";

$(function() {
	// 用户名正则
	$("#username").blur(
			function() {

				// 判断是否可以正常注册

				var json = {
					"username" : $("#username").val()
				};

				$.get("http://localhost:8080/MyTrip/registServlet", json,
						function(data, suss) {
							if (data == "true") {

								$("#checkUserNameResult").text("该用户已经被注册").css(
										'color', '#F53808');

							} else {
								$("#checkUserNameResult").text("可以正常注册").css(
										'color', '#2A00FF');
							}
						});

			});

	/**
	 * 2.密码不能少于6位数
	 */

	$("#password").blur(function() {
		var len = $("#password").val();
		var message = "";
		var flag = false;
		if (len.length < 6) {
			b = "2"; // 修改全局变量
			message = "密码不能少于6位！";
		} else {
			b = "0"; // 修改全局变量
			flag = true;
			message = "格式正确!"
		}
		if (flag) {
			$("#checkPasswordResult").text(message).css('color', '#0000ff');
		} else {
			$("#checkPasswordResult").text(message).css('color', '#f53808');
		}

	});
	/**
	 * 3.判断两次密码是否一样
	 */
	$("#repassword").blur(function() {
		var p1 = $("#password").val();
		var p2 = $("#repassword").val();
		var message = "";
		var flag = false;
		if (p1 != p2) {
			c = "3"; // 修改全局变量
			message = "两次密码不一样！";
		} else {
			c = "0"; // 修改全局变量
			flag = true;
			message = "格式正确!"
		}
		if (flag) {
			$("#checkRePasswordResult").text(message).css('color', '#0000ff');
		} else {
			$("#checkRePasswordResult").text(message).css('color', '#f53808');
		}
	});

	$("#phone").blur(function() {
		var phone = $("#phone").val();
		var reg_phone = /^1[34578][0-9]{9}$/;
		var message = "";
		var flag = false;
		if (!reg_phone.test(phone)) {
			d = "4"; // 修改全局变量
			message = "手机号格式不正确!"
		} else {
			d = "0"; // 修改全局变量
			flag = true;
			message = "格式正确!"
		}
		if (flag) {
			$("#checkPhone").text(message).css('color', '#0000ff');
		} else {
			$("#checkPhone").text(message).css('color', '#f53808');
		}

	});
	$("#email").blur(function() {
		var email = $("#email").val();
		// 定义一个变量，判断邮箱的正则
		var reg_email = /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
		var message = "";
		var flag = false;
		if (!reg_email.test(email)) {
			e = "5"; // 修改全局变量
			message = "你输入的邮箱不合法！";
		} else {
			e = "0";
			flag = true;
			message = "格式正确!";
		}
		if (flag) {
			$("#checkEmail").text(message).css('color', '#0000ff');
		} else {
			$("#checkEmail").text(message).css('color', '#f53808');
		}

	});

});

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
			}
		}
	}

	return xmlHttp;
}
/**
 * 编写一个方法 ：判断所有的输入框内容是否合法
 * 
 * @returns
 */
function check() {
	if (a == 1) {
		alert("用户信息有误!请检查后重新输入!")
		return false;
	}
	if (b == 2) {
		alert("密码信息有误!请检查后重新输入!")
		return false;
	}
	if (c == 3) {
		alert("第二次密码有误!请检查后重新输入!")
		return false;
	}
	if (d == 4) {
		alert("手机信息有误!请检查后重新输入!")
		return false;
	}
	if (e == 5) {
		alert("邮箱信息有误!请检查后重新输入!")
		return false;
	}
	
	var post = ajaxFunction();
	
	post.open("POST","ServletServlet",true);
	
	post.setRequestHeader("Content-type","application/x-www-form-urlencoded")
}
