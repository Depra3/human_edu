<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>ID : </td>
		<td>${mem.loginid }</td>
	</tr>
	<tr>
		<td>PW :</td>
		<td>${mem.pw }</td>
	</tr>
	<tr>
		<td>이름 : </td>
		<td>${mem.name }</td>
	</tr>
	<tr>
		<td>Mobile : </td>
		<td>${mem.mobile }</td>
	</tr>
	<tr>
<!-- 	<td colspan="2" align="center"><form action="/login"><input type="submit" value="확인"></form></td>  -->
		<td colspan="2" align="center"><button id=btnGo>확인</button></td>
	</tr>
</table>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnGo',function(){
	document.location="/login";
})
</script>
</body>
</html>