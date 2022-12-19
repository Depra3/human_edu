<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Room Type</title>
</head>
<body>
<br><br><br><br><br><br>
<form action="/insertRT" id="frmInsert">
<table border="1" align="center">
<tr><td>객실 타입명</td><td><input type="text" name="typename"></td></tr>
<tr><td align="center" colspan="2"><input type="submit" value="등록"></td></tr>
</table>
</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('submit','#frmInsert',function(){
	if($('typename').val()==''){
		alert('객실 타입명을 입력하시오.');
		return false;
	}
	return true;
})
</script>
</html>