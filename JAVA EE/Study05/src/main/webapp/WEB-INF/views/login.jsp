<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnSub',function(){
	if($('#loginid').val()==''||$('#pw').val()=='') return false;
	$('#frmlogin').submit();
})
</script>
<body>
<form action="/checkuser" id="frmlogin">
	<table>
		<tr><td>ID : </td>
			<td colspan="2"><input type="text" name="loginid" id="loginid"></td></tr>
		<tr><td>PW : </td>
			<td colspan="2"><input type="password" name="pw" id="pw"></td></tr>
		<tr><td><input type="submit" value="로그인" id="btnSub"></td>
			<c:if test="${error eq 1}">
				<td colspan="2"><label id="lbl">ID 혹은 PW가 잘못되었습니다.</label></td>
			</c:if>
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