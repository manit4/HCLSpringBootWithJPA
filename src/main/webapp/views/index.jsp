<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<H1 style="margin-left: 350px; color: Red">Welcome to HCL
		BookShop Application</H1>
	<h3 style="margin-left: 480px; margin-top: 50px; color: blue;">Provide
		your Credentials</h3>
		
		<h5 style="color: green; margin-left: 450px"> ${registrationmessage }</h3>
		
		<h5 style="color: red; margin-left: 450px"> ${loginErrorMessage }</h3>
		
		<form action="login" method="post">
	<div style="margin-left: 500px; margin-right: 500px; margin-top: 50px">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Username</label>
			<input type="text" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your Username" name="uname">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Password</label>
			<input type="password" class="form-control"
				id="exampleFormControlInput1" placeholder="Enter your Password" name="pwd">
		</div>
		<input style="margin-left: 90px" type="submit" class="btn btn-primary"><br>
		
		</form>
		<br> <a style="margin-left: 55px" href="registrationPage">New
			User, Register here!!</a>

	</div>
</body>
</html>