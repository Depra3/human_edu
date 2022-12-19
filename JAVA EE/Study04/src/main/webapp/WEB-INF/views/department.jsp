<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department</title>
</head>
<body>
<h1>Welcome to MyBatis world !!!!</h1>
<table border="1">
	<tr><th>부서번호</th><th>부서명</th><th>상위 부서명</th><th>부서장</th></tr>
	<c:forEach var="depart" items="${dt }">
		<tr>
			<td>${depart.department_id }</td>
			<td>${depart.department_name }</td>
			<td>${depart.parent_name }</td>
			<td>${depart.emp_name }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>