<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/gugudan"> <!-- method가 없어도 됨 -->
	<table>
		<tr>
			<td>단 : &nbsp;&nbsp;</td>
			<td><input type="text" name="dan"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="구구단 출력"></td>
		</tr>
	</table>
</form>
</body>
</html>