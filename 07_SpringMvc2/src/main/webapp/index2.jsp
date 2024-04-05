<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<%
//arrays
String[] daysArray={"mon,tue,wed,thur,fri,sat,sun"};
session.setAttribute("arraysodays",daysArray);

List daysList=new ArrayList();
daysList.add("mon");
daysList.add("tue");
daysList.add("weed");
daysList.add("thur");

request.setAttribute("listofdys", daysList);

%>
<h1 style="color:green;text-align:center;">
<c:out value="${listofdys[0]}"/>
</h1>
<c:forEach var="dayss" items="${listofdys}">
<h1 style="color:green;text-align:center;">
<c:out value="${dayss}"/>
</h1>
</c:forEach>
</body>
</html>