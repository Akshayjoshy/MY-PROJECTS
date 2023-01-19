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
  
}
		#reg{
			border:2px solid black;
			background:linear-gradient(135deg, #71b7e6, #9b59b6);
			height:50%;
			width:30%;
		}
		button {   
       background-color: darkblue;   
       width: 30%;  
        color: silver;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }  
          

</style>
</head>
		<body>
			<div id="reg">
	
				<form method="post" action="/saveUser">
	                      <center><h1>ADD USER</h1></center>
	                    &emsp;<label for="username">Username</label>
	                         <input type="text"  name="username" placeholder="Enter the username"><br><br>
	                         
	                         
	                    &emsp;<label for="password">Password</label>
	                        &nbsp;<input type="text" name="password" placeholder="Enter the password"><br><br>
	                          
	                       
	                       
	        &emsp;   <label>UserType</label>
							<select name="usertype">
										
										<option>USER</option>
										
							</select><br><br>
	                      
	  				 &emsp; &emsp;	 <button type="submit">Add User</button>
	                   
	                 </form>
	                    
	            </div>   
	   </body>
</html>