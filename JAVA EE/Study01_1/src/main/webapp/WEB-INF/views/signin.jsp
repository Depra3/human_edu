<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/viewuser" id="frmid">
	<table>
		<tr>
			<td>ID : </td>
			<td><input type="text" name="loginid"></td>
		</tr>
		<tr>
			<td>PW : </td>
			<td colspan="2"><input type="password" name="pw" id="pw"></td>
		</tr>
		<tr>
			<td>PW 확인 : </td>
			<td colspan="2"><input type="password" name="pwchk" id="pwchk"></td>
		</tr>
		<tr>
			<td>실명 : </td>
			<td colspan="2"><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>Mobile : </td>
			<td colspan="2"><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit" value="회원가입" id=btnGo> </td>
		</tr>
		<tr>
			<td><a href="/">홈으로</a></td>
			<td>&nbsp;</td>
			<td><a href="/login">로그인 하기</a></td>
		</tr>
	</table>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
// pw 확인 - Validation Check(데이터 유효성 검사)
$(document)
.on('submit','#frmid',function(){
	if($('#pw').val()==$('#pwchk').val()){
		return true;	
	}else{
		alert('비밀번호와 확인이 일치하지 않습니다.')
		return false;
	}
})
.on('click','#btnGo',function(){
	if($('#pw').val()==$('#pwchk').val()){
//		$('#frmid').submit(); return true와 같은 결과
		return true;
	}else{
		alert('비밀번호와 확인이 일치하지 않습니다.')
		return false;
	}
})
</script>
</html>