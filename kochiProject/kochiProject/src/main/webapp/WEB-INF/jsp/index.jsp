<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
    
}  
button {   
       background-color: darkblue;   
       width: 100%;  
        color: silver;   
        padding: 15px;   
        margin: 10px 0px;   
        border: none;   
        cursor: pointer;   
         }   
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 100%;   
        margin: 8px 0;  
        padding: 12px 20px;   
        display: inline-block;   
        border: 2px blue;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: auto;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
        padding: 25px;   
        background-color: lightblue;  
    }   
</style>   
</head>    
<body>    
    <center> <h1> LOGIN FORM </h1> </center>   
    <form action="/login" method="post">  
        <div class="container">   
            <label>EMAIL : </label>   
            <input type="text" name="email" placeholder="Enter Email" required>  
            <label>PASSWORD : </label>   
            <input type="password" name="password" placeholder="Enter Password" required>  
            
            <button type="submit">LOGIN</button>   
            
             <a  href="AddUser.jsp"> AddUser?</a>
             </div>   
    </form>     
</body>     
</html>  


			

		

