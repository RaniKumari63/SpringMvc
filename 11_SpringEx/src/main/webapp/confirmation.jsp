<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<!DOCTYPE html>  
<html>  
<body>  
<p>Your reservation is confirmed successfully. Please, re-check the details.</p>  
First Name : ${reservation.firstName} <br>  
Last Name : ${reservation.lastName} <br>
Gender:${reservation.Gender} <br>
Meals:
<ul>

<c:forEach var="meal" items="${reservation.food}">  
<li>${meal}</li>  
</c:forEach> 

</ul>
Food:${reservation.Food }
</body>  
</html>  