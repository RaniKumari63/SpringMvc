<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:green;text-align:center;">${student.sno}</h1>
<h1 style="color:green;text-align:center;">${student.sname}</h1>
<h1 style="color:green;text-align:center;">${student.saddr}</h1>
<h1 style="color:green;text-align:center;">${student.gender}</h1>
<h1 style="color:green;text-align:center;">${student.from}</h1>
<h1 style="color:green;text-align:center;">${student.to}</h1>
<c:forEach var="language" items="${student.languages}">
<h1 style="color:green;text-align:center;">${language}</h1>
</c:forEach>
</body>
</html>