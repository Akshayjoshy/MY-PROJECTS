<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN HOME PAGE</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-color: #f0f1f9;">
	<!-- Start Navbar -->
	<!--<nav class="navbar navbar-light" style="background: linear-gradient(135deg, #71b7e6, #9b59b6);">-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="background: linear-gradient(135deg, #71b7e6, #9b59b6);">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">ONLINE GROCERY MARKET</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/home">HOME</a></li>
					
					<li class="nav-item"><a class="nav-link"
						 href="/getAllUsers">USER</a></li>
					
					<li class="nav-item"><a class="nav-link"
						 href="/getAllVendors">VENDOR</a></li>
					<li class="nav-item"><a class="nav-link"
						 href="/">LOG OUT</a></li>
					
				</ul>
				<form  class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
<%-- 	<img src="file:///D:/html%20programs/supermarket.webp" height="650" width="1300"/> --%>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>