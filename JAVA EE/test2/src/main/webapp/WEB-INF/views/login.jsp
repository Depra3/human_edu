<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method="get" action="/checkuser">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="userid"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="passcode"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" ><input type="submit" value="로그인"></td>
		</tr>
	</table>
</form>
<a href="/signin">회원가입</a>
</body>
</html>