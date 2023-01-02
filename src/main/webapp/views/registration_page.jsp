<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1 style="margin-left: 300px; color: Red">Welcome to HCL
		BookShop Application</H1>
	<h3 style="margin-left: 450px; margin-top: 50px; color: blue;">Provide your Personal Details</h3>
<div style="margin-left: 500px; margin-right: 500px; margin-top: 50px">

<form action="register" method="post">
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Username</label> <input type="text" class="form-control"
			 placeholder="Enter your Username" name="username">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Password</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter your Password" name="password">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Complete Name</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter your Complete Name" name="name">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Email Address</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter your Email Address" name="email">
	</div>
	<input style="margin-left: 90px" type="submit" class="btn btn-primary" value="Register"><br><br>
	
	</div>
	</form>
	
	
</body>
</html>