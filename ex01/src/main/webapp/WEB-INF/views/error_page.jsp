<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
					<!--모델에서의 키-->
	<h4><c:out value="${exception.getMessage()}"></c:out></h4>
	
	<c:forEach items="${exception.getStackTrace()}" var="stack">
		<li><c:out value="${stack}"></c:out></li>
	</c:forEach>
</body>
</html>