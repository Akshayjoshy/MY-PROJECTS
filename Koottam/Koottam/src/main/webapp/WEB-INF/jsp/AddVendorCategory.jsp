<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


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
<body>    <%--<img src="file:///D:/html%20programs/supermarket.webp" height="338" width="338"/> --%>
		 <div id="reg"> 
      
    <form action="/saveVendorCategory" method="post">  
          <center> <h1> ADD VENDOR CATEGORY </h1> </center> 
     &emsp;<label>USERNAME  </label>   
            <input type="text" name="username" placeholder="Enter username" required> <br><br> 
      
            
       <center>    <button type="submit">LOGIN</button> </center>   
            
           
             </div>   
    </form>     
</body>   
</html>