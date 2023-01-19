<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>AdminHomePage</title>
<style>
*{
	font-family:sans-serif;
}
span{
	font-size:20px;
	position: absolute ;
	left: 1%;
	top :11%;
	height:40px;
	padding:5px;
	width:1450px;
	background:linear-gradient(135deg, #71b7e6, #9b59b6);
	color:white;

}

.main{
	margin:10% auto 0;
	height:500px;
	width:1460px;
	border: 2px solid linear-gradient(135deg, #71b7e6, #9b59b6);
    border-radius: 4px;
	position:absolute right;
}
h1{
	color:#0652C5;
}
.click{
		left:5%;
}
.main .a{
			position:absolute;


}
</style>
</head>
<body>
<form action="/home" method="post">
<span>Home Page-Admin</span>
<div class="main">

<h1>Welcome Admin !</h1>
<br>
<br>

&emsp;&emsp;<a href="/user">ADD USER</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="/getAllUsers">VIEW ALL USER</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="/vendors">ADD VENDOR</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">VIEW ALL VENDOR</a>
<br>
<br>
<br>
<br>
&emsp;&emsp;<a href="">ADD VENDOR CATEGORY</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">VIEW VENDOR CATEGORY</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="/">LOG OUT</a>



</div>


</form>

</body>
</html>