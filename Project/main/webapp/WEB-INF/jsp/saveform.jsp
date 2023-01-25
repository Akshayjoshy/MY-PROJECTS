
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <form:form method="POST" action="savedata"
  modelAttribute="userForm">
    <form:label path="std_name">Name</form:label>
    <form:input path="std_name" />
     
    <form:label path="std_no">No</form:label>
    <form:input path="std_no" />
     
    <input type="submit" value="Submit" />
</form:form> --%>

<form action="savedata" method="post" >
Student Roll no:<input type="text" name="std_no"><br>
Student Name:<input type="text" name="std_name"><br>
<button type="submit"  value="Submit">Submit</button>
</form>

</body>
</html>