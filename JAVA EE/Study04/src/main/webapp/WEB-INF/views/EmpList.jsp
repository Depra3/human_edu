<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직원명단 by AJAX</title>
</head>
<body>
<input type="button" id="btnGet" value="직원 명단 조회">
<input type="button" id="btnClear" value="초기화">
<br><br>
<table border="1" id="tblList">
	<tr><th>사번</th><th>이름</th><th>월급여</th><th>매니저이름</th></tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.on('click','#btnGet',function(){
	$.get('/getEmpList',{},function(data){
		// 들어오는 데이터 모양 { 'employee_id':100, 'emp_name':'Steven King', 'salary':24000, 'mname':''}
		for(i=0; i<data.length;i++){
			let person=data[i];
			let str='<tr><td>'+person['eid']+'</td><td>'+person['emp_name']+'</td><td>'+person['salary']+
					'</td><td>'+person['mname']+'</td></tr>';
			$('#tblList').append(str);
		}
	},'json')
})
.on('click','#btnClear',function(){
	$('#tblList tr:gt(0)').remove();
})
</script>
</html>