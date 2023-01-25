<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>VIEW ALL USER</title>
</head>
	<body>
		
			<h2>Users list</h2>
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Username</th>
						<th scope="col">Password</th>
						<th scope="col">UserType</th>
						<th scope="col">Delete</th>
						<th scope="col">Update</th>
					</tr>
				</thead>
				<tbody>
					
						<tr>
							<td>${object.getId()}</td>
							<td>${object.getUsername()}</td>
							<td>${object.getPassword()}</td>
							<td>${object.getUsertype()}</td>
							<td><a href="deleteUser/${object.id}">Delete</a></td>
							<td><a href="editUser/${object.id}">Update</a></td>
						</tr>
	
	
					
				</tbody>
			</table>
	
		
	</body>
</html>