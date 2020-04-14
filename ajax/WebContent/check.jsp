<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function ajaxFunction(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){
		    	  alert("your browser not support Ajax!");
		      }
		      }
	    }

		return xmlHttp;
	 }
function check(){
	var username = document.getElementById("username").value;
	var request =ajaxFunction();
	request.open("POST","CheckUsernameServlet",true);
	
	
	//发送数据，分两步 先添加头 代表是经过url编码的数据。
	request.setRequestHeader("Content-type","application/x-www-form-urlencoded");
	request.send("username="+username);

	//获取响应
	// alert(request.responseText);
	request.onreadystatechange=function()
  {
  if (request.readyState==4 && request.status==200)
    {
	 // alert(request.responseText);
	  var checkUsername= request.responseText;
    if (checkUsername>0) {
    	 document.getElementById("span1").innerHTML="对不起 ，用户名已经被使用";
	}else{
		 document.getElementById("span1").innerHTML="恭喜您,用户名可用";
	}
    
    }
  }

}

</script>
</head>
<body>
<form action="CheckUsernameServlet" method="post">
用户名：<input type ="text" name ="username" id="username" onblur="check()"><span id = "span1"></span>
<input type = "submit" value="提交">
</form>
</body>
</html>