<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT USER</title>
<style>
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  
}
		#reg{
			border:2px solid black;
			background:linear-gradient(135deg, #71b7e6, #9b59b6);
			height:50%;
			width:40%;
		}
		
</style>
</head>
	<body>
		<main>
			<section>
	         	<div id ="reg">
	               
	                    <form method="post" action="/updateUser">
	                       
	                          <h1>Edit User</h1>
	                        
	                        <input type="text" id="id" name="id" class="form-control" value="${user.getId()}" hidden>
	                        
	                          <input type="text" id="username" name="username" class="form-control" placeholder="Enter the username" value="${user.getUsername()}">
	                          <label for="username" class="form-label">Username</label>
	                       
	                        
	                          <input type="text" id="password" name="password" class="form-control" placeholder="Enter the password" value="${user.getPassword()}">
	                          <label for="password" class="form-label">Password</label><br><br>
	                       
	                        
	                            <label class="form-label">Select Usertype</label>
	                            <select class="form-select" name="usertype" aria-label="usertype" id="usertype" >
	                            	<c:forEach items="${userTypes}" var = "userType">
	                                	<option value = "${userType}">${userType}</option>
	                                </c:forEach>
	                            </select>
	                      
	                          <button type="submit" id="user-submit" class="btn btn-outline-primary btn-lg">Update User</button>
	                       
	                    </form>
	                    
	                </div>
	           
	        </section>
		</main>
	
	</body>
</html>