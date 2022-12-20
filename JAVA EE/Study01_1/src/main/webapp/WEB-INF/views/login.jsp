<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/checkuser">
	<table>
		<tr>
			<td>ID : </td>
			<td colspan="2"><input type="text" name="loginid"></td>
		</tr>
		<tr>
			<td>PW : </td>
			<td colspan="2"><input type="password" name="pw"></td>
		</tr>
		<tr>
			<td colspan="3"><input type="submit" value="로그인"></td>
		</tr>
		<tr>
			<td><a href="/">홈으로</a></td>
			<td>&nbsp;</td>
			<td><a href="/signin">회원가입</a></td>
		</tr>
	</table>
</form>
</body>
</html>