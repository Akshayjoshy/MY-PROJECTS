<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Student</h1>  
       <form:form action="/editsave" method="POST" modelAttribute="student">    
        <table >     
        <form:hidden path="id" />          
         <tr>    
          <td>RollNo :</td>    
          <td><form:input path="rollno" /></td>  
         </tr>   
         <tr>    
          <td>Name :</td>    
          <td><form:input path="name" /></td>  
         </tr>  
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>  
</body>
</html>