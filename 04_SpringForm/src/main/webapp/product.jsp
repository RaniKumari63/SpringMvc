<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>




<body>
<div class="container">

<div class="card-header"><h1 style="text-align: center;">ProductForm</h1></div>
<div class="card-body">
 
  <form:form action="insert.sp" modelAttribute="product1">
     productid: <form:input path="pid"  /><br>
  
     productname: <form:input path="pname"  /><br>
   
  
  
      prouductqty:<form:input  path="qty" /><br>
   
   
     productyprice:<form:input  path="price" /><br>
     
  
  
      <button type="submit" class="btn btn-primary">Sign in</button>
      </form:form>
      
  </div>
  </div>
  </body>
  </html> 
