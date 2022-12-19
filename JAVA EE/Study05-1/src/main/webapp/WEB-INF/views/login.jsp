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
.on('click','#btnGo',function(){
	if($('#loginid').val()==''||$('#pw').val()==''){
		alert('ID/PW을 입력하십시오.');
		return false;
	}
	$.post('/checkuser',{loginid:$('#loginid').val(),pw:$('#pw').val()},function(data){
		if(data=='ok'){
			document.location="/";
		} else{
			// document.location="/login";
			alert('로그인 실패. ID와 PW가 정확히 입력되어야 합니다.');
			$('#loginid,#pw').val('');
		}
	}, 'text');
})
</script>
<body>
	<table>
		<tr><td>ID : </td>
			<td colspan="2"><input type="text" id="loginid"></td></tr>
		<tr><td>PW : </td>
			<td colspan="2"><input type="password" id="pw"></td></tr>
		<tr><td><input type="button" value="로그인" id="btnGo"></td>
		</tr>
		<tr>
			<td><a href="/">홈으로</a></td>
			<td>&nbsp;</td>
			<td><a href="/signin">회원가입</a></td>
		</tr>
	</table>
</body>
</html>