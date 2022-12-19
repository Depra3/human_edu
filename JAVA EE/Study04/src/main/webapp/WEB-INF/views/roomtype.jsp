<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Room type</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#tblList tr',function(){
	let typenum = $(this).find('td:eq(0)').text();
	let typename = $(this).find('td:eq(1)').text();
	console.log('typenum ['+ typenum +'] typename [' + typename + ']');
	$('#typenum').val(typenum);
	$('#typename').val(typename);
	$('#optype').val('update');
// 	return false; // 버블링 효과를 막기 위한 코드 
})
.on('click','#btnDelete',function(){
	if($('#typenum').val()==''||$('#typename').val()=='') return false;
	$('#optype').val('delete');
	$('#frmControl').submit();
})
.on('click','#btnAddNew',function(){
	if($('#typename').val()=='') return false;
// 	$('#optype').val('insert');
	$('#frmControl').submit();
})
.on('click','#btnReset',function(){
	$('#typenum,#typename').val('');
	$('#optype').val('insert');
	return false;
})
</script>
<body>
<h1>Welcome to MyBatis world !!!!</h1>
<table border="1" id="tblList">
	<tr><th>Type Number</th><th>Type Name</th></tr>
	<c:forEach var="roomtype" items="${rt }">
		<tr>
			<td>${roomtype.typenum }</td>
			<td>${roomtype.typename }</td>
		</tr>
	</c:forEach>
</table>
<form id="frmControl" action="/controlRoomType">
<input type="hidden" id="optype" name="optype" value='insert'>
<!-- <input type="text" id="optype" name="optype" value='insert'> -->
	<table>
		<tr><td>Type Number</td><td><input type="text" name="typenum" id="typenum" readonly></td></tr>
		<tr><td>Type Name</td><td><input type="text" name="typename" id="typename"></td></tr>
		<tr><td colspan="2" align="center">
			<input type="button" value="등록" id="btnAddNew">
			<input type="button" value="삭제" id="btnDelete">
			<input type="button" value="비우기" id="btnReset">
			</td></tr>
	</table>
</form>
</body>
</html>