<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD USER</title>
<style>
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
		#reg{
			border:2px solid black;
			background-color:white;
			height:80%;
			width:30%;
		}

</style>
</head>
		<body>
			<div id="reg">
	
				<form method="post" action="/saveUser">
	                      <center><h1>Add User</h1></center>
	                        <label for="username">Username</label>
	                         <input type="text"  name="username" placeholder="Enter the username"><br><br>
	                         
	                          
	                          
	                      
	                        <label for="password">Password</label>
	                        &nbsp;<input type="text" name="password" placeholder="Enter the password"><br><br>
	                          
	                       
	                       
	            <label>UserType</label>
							<select name="usertype">
										<option>ADMIN</option>
										<option>BACKOFFICE</option>
										
							</select>
	                      
	  					 <button type="submit">LOGIN</button>
	                   
	                 </form>
	                    
	            </div>   
	   </body>
</html>