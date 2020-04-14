<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

$(document).ready(function (){
	$("#fuck").load("/jquery&ajax/Return",function(responseText,statusTxt,xhr){
		$("#fuck").text(responseText)
	})
})
</script>
</head>
<body>

<div id="fuck" style="width:500px"></div>
</body>
</html>