<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
    	
		<title>Add Vendor</title>
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
			 background: linear-gradient(135deg, #71b7e6, #9b59b6);
			height:80%;
			width:50%;
		}
		button {   
       background-color: darkblue;   
       width: 20%;  
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
	                
	                    <form method="post" action="/saveVendor">
	                     <center><h1>ADD VENDOR</h1></center>
	                       
	                     <center><h3>Address</h3></center>
	                        
					&emsp;<label for="houseName">House name</label>
	                          <input type="text" id="houseName" name="houseName" placeholder="Enter the House Name">&emsp; <label for="district" class="form-label">District</label>&nbsp;&nbsp;<input type="text" id="district" name="district" class="form-control" placeholder="Enter the district name"><br><br> 
	                          
	                &emsp;<label for="street" class="form-label">Street</label>
	                    &emsp;&emsp;&nbsp;    <input type="text" id="street" name="street" class="form-control" placeholder="Enter the Street name">&emsp;&nbsp;<label for="state" class="form-label">State</label>&nbsp;&nbsp;&nbsp;&emsp;<input type="text" id="state" name="state" class="form-control" placeholder="Enter the name of the state"><br><br>
	                          
	                       
	                    &emsp;    <label for="postOffice" class="form-label">Post Office</label>
	                          <input type="text" id="postOffice" name="postOffice" class="form-control" placeholder="Enter the post office name">&emsp;<label for="state" class="form-label">PIN Code</label>&nbsp;<input type="number" id="pinCode" name="pinCode" class="form-control" placeholder="Enter the PIN code"><br><br>
	                  
	                          
	                       <br><br> <br>
								<input hidden type="text" id="vendorCategoryId" name="vendorCategoryId" value="">
	                         
							
						&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;	<label for="vendorName" class="form-label">Vendor Name</label>
	                    &emsp;&emsp;&emsp;&nbsp;      <input type="text" id="vendorName" name="vendorName" class="form-control" placeholder="Enter the Vendor Name"><br><br>
	                          
						&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;	<label for="vendorPassword" class="form-label">Vendor Password</label>
	                     &emsp;&emsp;     <input type="password" id="vendorPassword" name="vendorPassword" class="form-control" placeholder="Enter the Vendor Password"><br><br>
	                      &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;     <label class="form-label">Select Vendor Category</label>   
	                                        
								<input type="text" name="vendorCategoryName" placeholder="Enter the Vendor Catogory Name"><br><br>
	                       
						&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;		<label class="form-label">Select Vendor UserType</label>
	                            <select name="vendorUserType">
	                                <option>INDIVIDUAL</option> 
									<option>ORGANISATION</option> 
	                            </select><br><br>
	                       
	                       <center><button type="submit">Add Vendor</button></center>
	                       
	                    </form>
	            </div>   
	</body> 
</html>