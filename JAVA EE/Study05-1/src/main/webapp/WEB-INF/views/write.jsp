<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	$.post('/dowrite',{title:$('#title').val(),content:$('#content').val()},function(data){
		console.log(data);
		document.location="/"; 
	},'text');
// 	document.location="/"; // Asynchronous- 비동기식
// 데이터를 보내고 document.location을 실행 후 데이터가 오면 그제서야 실행함. 따라서, 구문 내에 넣어야 데이터 받고 실행
})
.on('click','#btnRe',function(){
	$('#title,#content').val();
})
</script>
<body>
<table>
	<tr><td>글 제목</td><td><input type="text" id="title" style="width:350px"></td></tr>
	<tr><td align="top">글 내용</td><td><textarea rows="15" cols="50" id="content" style="resize:none" requiered></textarea> </td></tr>
	<tr><td colspan="2" align="center"><input type="button" id="btnGo" value="등록">&nbsp;&nbsp;&nbsp;
										<input type="button" id="btnRe" value="비우기"></td></tr>
</table>
<!-- <form action="/dowrite" method="post" id="frmInsert"> -->
<!-- 	<table> -->
<!-- 		<tr><td>글 제목</td><td><input type="text" id="title" style="width:350px"></td></tr> -->
<!-- 		<tr><td align="top">글 내용</td><td><textarea rows="15" cols="50" id="content" style="resize:none" requiered></textarea> </td></tr> -->
<!-- 		<tr><td colspan="2" align="center"><input type="submit" id="btnGo" value="등록"> -->
<!-- 										<input type="button" id="btnRe" value="비우기"></td></tr> -->
<!-- 	</table> -->
<!-- </form> -->
</body>
</html>