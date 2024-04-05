<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="card-header"><h1 style="text-align: center;">StudentForm</h1></div>
<div class="card-body">
<form:form action="insert.stu" modelAttribute="student1">

  <div class="mb-3">
    <label >StudentNo:</label>
    <form:input  class="form-control" id="snumber" path="sno" aria-describedby="emailHelp"/>
   
  </div>
  <div class="mb-3">
    <label ">StudentName</label>
    <form:input  class="form-control" id="sname1" path="sname" aria-describedby="emailHelp"/>
  
  </div>
  <div class="mb-3">
    <label >StudentAddress</label>
    <form:input  class="form-control" id="saddress" path="saddr" aria-describedby="emailHelp"/>
   
  </div>
  
 
   <div class="mb-3">
    <label >StudentGender</label>
    <form:radiobutton id="sgender1"  path="gender" value="Male" aria-describedby="emailHelp"/>Male
    <form:radiobutton  id="sgender1" path="gender" value="Female"  aria-describedby="emailHelp"/>Female
  </div>
   <div class="mb-3">
    <label> From </label>
    <form:select  id="from11"  path="from" aria-describedby="emailHelp">
    <form:option value="Guntur"></form:option>
    <form:option value="hyd"></form:option>
    </form:select> 
   
  </div>
   <div class="mb-3">
    <label >To</label>
    <form:select  id="too11"  path="to" aria-describedby="emailHelp">
   <form:option value="viz"></form:option>
    <form:option value="hyd"></form:option>
    </form:select> 
  </div>
   <div class="mb-3">
   
    <label >Languages</label>
  java
   <form:checkbox path="languages" value="java"></form:checkbox>
    sql<form:checkbox path="languages" value="sql"></form:checkbox>
   phyton<form:checkbox path="languages" value="phyton"></form:checkbox>
     spring <form:checkbox path="languages" value="spring"></form:checkbox>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
</div>
</body>
</html>