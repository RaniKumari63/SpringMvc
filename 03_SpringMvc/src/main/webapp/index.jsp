<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>




<div class="container">
<div class="card-header"><h1 style="text-align: center; ">Login Form</h1></div>
<div class="card-body">
<%
String msg=(String)request.getAttribute("msg1");
if (msg!=null)
	
{
	%>
	<h1>${msg1}</h1>
	<% }%>
<form action="login.ds">
  <div class="mb-3">
    <label for="username" class="form-label">UserName</label>
    <input type="text" class="form-control" id="username" name="uname" aria-describedby="emailHelp">
  
  </div>
  <div class="mb-3">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password" name="pwd">
  </div>
  <button type="submit" class="btn btn-primary">Click Me</button>
</form>
</div>
</div>
</body>
</html>
