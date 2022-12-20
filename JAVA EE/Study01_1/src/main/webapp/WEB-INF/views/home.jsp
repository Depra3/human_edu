<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${empty userid}">
<a href="/login">로그인</a>&nbsp;&nbsp;<a href="/signin">회원가입</a><br>
</c:if>
<c:if test="${not empty userid}">
<label>${userid }</label>&nbsp;&nbsp;<a href="/signout">로그아웃</a>
</c:if>
<h1>Welcome to My Home!!!</h1>
</body>
</html>