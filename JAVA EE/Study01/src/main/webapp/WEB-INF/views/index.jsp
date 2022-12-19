<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>
</head>
<body>
<h1>Welcome to my Site !!!</h1>
<form action="/addMember">
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>ID</td>
			<td><input type="text" name="loginid"></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="password" name="passcode"></td>
		</tr>
		<tr>
			<td>모바일 번호</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="회원가입"></td>
		</tr>
	</table>
</form>
</body>
</html>