<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX Test</title>
</head>
<body>
<input type="text" name="va" id="va"><br><br>
<input type="text" name="vb" id="vb"><br><br>
<input type="button" value="plus" id="btnPlus"><br><br>
<label id="lblResult"></label>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnPlus',function(){
	// AJAX call with GET 방식
	$.get('/doPlus',{first:$('#va').val(), second:$('#vb').val()},
// 	get방식	action  {				객체 : key - value			}
			function(data){
				$('#lblResult').text(data);
			},'text');
// 			data를 text형식으로 이동
// $.get('action',{객체 : key-value},function(data),데이터 이동형식)
})
</script>
</html>