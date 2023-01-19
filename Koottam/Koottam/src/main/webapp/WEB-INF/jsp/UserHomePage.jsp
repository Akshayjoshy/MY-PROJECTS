<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>UserHomePage</title>
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
<form action="home" method="post">
<span>Home Page-Admin</span>
<div class="main">

<h1>Welcome User !</h1>
<br>
<br>

&emsp;&emsp;<a href="">Crops</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href=""> insecticides</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">Customer</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">Sign Out</a>
<br>
<br>
<br>
<br>
&emsp;&emsp;<a href="">Add New</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">Date Wise</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">View</a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<a href="">Faculty Wise</a>
&emsp;&emsp;&emsp;<a href="">Student Wise</a>


</div>


</form>

</body>
</html>