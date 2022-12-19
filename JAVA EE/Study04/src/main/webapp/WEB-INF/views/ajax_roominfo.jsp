<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script>
$(document)
.ready(function(){
	loadRoomInfo();
	$.get('/getRoomType',{},function(data){
		for(i=0;i<data.length;i++){
			let rtype = data[i];
			let str='<option value='+rtype['typenum']+'>'+rtype['typename']+'</option>';
			$('#itype').append(str);
		}
	},'json')
})
.on('click','#tblList tr',function(){
	$('#inum').val($(this).find('td:eq(0)').text());
	$('#iname').val($(this).find('td:eq(1)').text());
	$('#itype').val($(this).find('td:eq(2)').text());
	$('#ihmany').val($(this).find('td:eq(3)').text());
	$('#ihmuch').val($(this).find('td:eq(4)').text());
	$('#optype').val('update');
	return false;
})
.on('click','#btnAdd',function(){
	if($('#iname').val()==''||$('#itype').val()==''||$('#ihmany').val()==''||$('#ihmuch').val()=='') return false;
	$.get("/cudRoomInfo",{optype:$('#optype').val(),num:$('#inum').val(),name:$('#iname').val(),
							type:$('#itype').val(),howmany:$('#ihmany').val(),howmuch:$('#ihmuch').val()},
		function(){
			loadRoomInfo();
			$('#btnRe').trigger('click');
		},'text');
	return false;
})
.on('click','#btnDel',function(){
	if($('#inum').val()=='') return false;
	$.get("/cudRoomInfo",{optype:'delete',num:$('#inum').val(),name:$('#iname').val(),
							type:$('#itype').val(),howmany:$('#ihmany').val(),howmuch:$('#ihmuch').val()},
		function(){
			loadRoomInfo();
			$('#btnRe').trigger('click');
	}, 'text');
	return false;
})
.on('click','#btnRe',function(){
	$('#inum,#iname,#itype,#ihmany,#ihmuch').val('');
	$('#optype').val('insert');
})

function loadRoomInfo(){
	$('#tblList tr:gt(0)').remove(); // 첫줄 빼고 전부 지우기
	$.get('/getRoomInfo',{},function(data){
		for(i=0;i<data.length;i++){
			let rinfo = data[i];
			let str='<tr><td>'+rinfo['num']+'</td><td>'+rinfo['name']+'</td><td>'+rinfo['type']+
					'</td><td>'+rinfo['howmany']+'</td><td>'+rinfo['howmuch']+'</td></tr>';
			$('#tblList').append(str);
		}
	},'json')
}
</script>
<body>
<table align="center">
	<tr>
		<td valign="top">
			<table border="1" id="tblList">
				<tr><th>NUM</th><th>NAME</th><th>TYPE</th><th>HOWMANY</th><th>HOWMUCH</th></tr>
			</table>
		</td>
		<td valign="top">
			<input type="hidden" id="optype" name="optype" value='insert'>
			<table>
				<tr><td>Num</td><td><input type="text" name="inum" id="inum" readonly></td></tr>
				<tr><td>Name</td><td><input type="text" name="iname" id="iname"></td></tr>
				<tr><td>Type</td>
					<td>
						<select id=itype name=itype>
<%-- 							<c:forEach var="roomtype" items="${rt }"> --%>
<%-- 								<option value="${roomtype.typenum }">${roomtype.typename }</option> --%>
<!-- 							</c:forEach> -->
						</select>
					</td>
				</tr>
				<tr><td>Howmany</td><td><input type="text" name="ihmany" id="ihmany"></td></tr>
				<tr><td>Howmuch</td><td><input type="text" name="ihmuch" id="ihmuch"></td></tr>
				<tr><td colspan="2" align="center">
					<input type="button" value="등록" id="btnAdd">
					<input type="button" value="삭제" id="btnDel">
					<input type="button" value="비우기" id="btnRe">
				</td></tr>
			</table>
		</td>
	</tr>
</table>
</body>
</html>