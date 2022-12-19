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
.on('click','#tblRiList tr',function(){
// 	let num = $(this).find('td:eq(0)').text();
// 	let name = $(this).find('td:eq(1)').text();
// 	let type = $(this).find('td:eq(2)').text();
// 	let howmany = $(this).find('td:eq(3)').text();
// 	let howmuch = $(this).find('td:eq(4)').text();
// 	$('#inum').val(num);
// 	$('#iname').val(name);
// 	$('#itype').val(type);
// 	$('#ihmany').val(howmany);
// 	$('#ihmuch').val(howmuch);
	$('#inum').val($(this).find('td:eq(0)').text());
	$('#iname').val($(this).find('td:eq(1)').text());
	$('#itype').val($(this).find('td:eq(2)').text());
	$('#ihmany').val($(this).find('td:eq(3)').text());
	$('#ihmuch').val($(this).find('td:eq(4)').text());
	$('#rInfo').val('update');
	return false;
})
.on('click','#btniAdd',function(){
	if($('#iname').val()==''||$('#itype').val()==''||$('#ihmany').val()==''||$('#ihmuch').val()=='') return false;
	$('#frminfo').submit();
})
.on('click','#btniDel',function(){
	if($('#inum').val()==''||$('#iname').val()==''||$('#itype').val()==''||
			$('#ihmany').val()==''||$('#ihmuch').val()=='') return false;
	$('#rInfo').val('delete');
	$('#frminfo').submit();
})
.on('click','#btniRE',function(){
	$('#inum,#iname,#itype,#ihmany,#ihmuch').val('');
	$('#rInfo').val('insert');
	// 띄어쓰기 불가
	return false;
})
</script>
<body>
<h1>Welcome to MyBatis world !!!!</h1>
<table border="1" id="tblRiList">
	<tr><th>NUM</th><th>NAME</th><th>TYPE</th><th>HOWMANY</th><th>HOWMUCH</th></tr>
	<c:forEach var="roominfo" items="${ri }">
		<tr>
			<td>${roominfo.num }</td>
			<td>${roominfo.name }</td>
			<td>${roominfo.type }</td>
			<td>${roominfo.howmany }</td>
			<td>${roominfo.howmuch }</td>
		</tr>
	</c:forEach>
</table>
<form id="frminfo" action="/controlRoomInfo">
<input type="hidden" id="rInfo" name="rInfo" value="insert">
<table>
	<tr><td>Num</td><td><input type="text" name="inum" id="inum" readonly></td></tr>
	<tr><td>Name</td><td><input type="text" name="iname" id="iname"></td></tr>
<!-- 	<tr><td>Type</td><td><input type="text" name="itype" id="itype"></td></tr> -->
	<tr><td>Type</td>
		<td><select id=itype name=itype>
			<c:forEach var="roomtype" items="${rt }">
				<option value="${roomtype.typenum }">${roomtype.typename }</option>
<!-- 				getParameter가 option의 text가 아닌 value를 이용함 -->
			</c:forEach>
		</select>
		</td></tr>
	<tr><td>Howmany</td><td><input type="text" name="ihmany" id="ihmany"></td></tr>
	<tr><td>Howmuch</td><td><input type="text" name="ihmuch" id="ihmuch"></td></tr>
	<tr><td colspan="2" align="center">
		<input type="button" value="등록" id="btniAdd">
		<input type="button" value="삭제" id="btniDel">
		<input type="button" value="비우기" id="btniRE">
	</td></tr>
</table>
</form>
</body>
</html>