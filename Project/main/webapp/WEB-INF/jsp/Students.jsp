<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body>
<div class="container">
<h2>Student list</h2>
<table class="table table-hover">
<tr>
<th>Id</th>
<th>Roll number</th>
<th>Student Name</th>
<th>Delete</th>
<th>Update</th>
</tr>
<tbody>
<c:forEach items="${list}" var="object">
<tr>
<td>${object.getId()}</td>
<td>${object.getRollno()}</td>
<td>${object.getName()}</td>
<td><a href="deleteemp/${object.id}">Delete</a></td> 
<td><a href="editemp/${object.id}">Update</a></td>   
</tr>


</c:forEach>
</tbody>
</table>
</div>
</body>
</html>