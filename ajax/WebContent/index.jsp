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
	 function get(){
		 var request = ajaxFunction();
		 request.open("GET","indexServlet?name=lin&age=21",true);
		 request.send();
	 }

function get(){
	var request = ajaxFunction();
	//带数据发送请求
	request.open("GET","indexServlet?name=lin&age=21",true);
	//获取响应数据
	request.onreadystatechange=function()
	  {
	  if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    {
	 //弹出响应的信息
		alert(request.responseText);
	    }
	  }
	request.send();
}

</script>
</head>
<body>


<a  href="" onclick="get()"  >点我发送请求</a>

</body>
</html>