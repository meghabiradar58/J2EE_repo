<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Insert title here</title>
<style type="text/css">
body{
 background-size: cover;
 background-repeat: no-repeat;
 width: 70%;
 height: 70px;

}
</style>
</head>

<body>

 <!-- Navbar -->


	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="#">EMP System</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="addemp">Add
						EMP</a></li>

			</ul>
		</div>
	</nav>

	<!-- Navbar -->
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary">Add Emp</h4>

						<form th:action="@{/register}" method="post">

							<div class="form-group">
								<label>Enter Full Name</label> <input type="text"
									class="form-control" name="name">
							</div>

							<div class="form-group">
								<label>Enter Address</label> <input type="text"
									class="form-control" name="address">
							</div>

							<div class="form-group">
								<label>Enter Email</label> <input type="email"
									class="form-control" name="email">
							</div>


							<div class="form-group">
								<label>Enter Phone No</label> <input type="number"
									class="form-control" name="phno">
							</div>


							<div class="form-group">
								<label>Enter Salary</label> <input type="number"
									class="form-control" name="salary">
							</div>

							<button class="btn btn-primary btn-block">Submit</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
                
</body>
</html>