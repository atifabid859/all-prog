<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>

	<div class="container">
		<div class="card mx-auto mt-5 bg-secondary"
			style="width: 70%; height: 10%">
			<h3 class="text-center text-white" style="text-transform: uppercase;">Sign
				Up</h3>
			
<div class="alert alert-danger" role="alert">
<form:errors path="userFom.*"/>
</div>
			<div class=" card-body py-5">
				<form class="mt-3" action="handleform" method="post">


					<div class="row mt-5">
						<div class=" text-center col-md-5 mb-3">
							<label for="inputEmail4"> First Name:</label> <input type="text"
								class="form-control" name="fName" placeholder="Enter First Name">
						</div>
						<div class=" text-center col-md-5 mb-3">
							<label for="inputEmail4"> Last Name:</label> <input type="text"
								class="form-control" name="lName" placeholder="Enter Last Name">
						</div>
					</div>


					<div class="row mt-5">
						<div class="text-center col-md-5 mb-3">
							<label for="emailid">Email Id</label> <input type="text"
								class="form-control" name="email" placeholder=" Enter the Email">
						</div>
						<div class="text-center col-md-5 mb-4">
							<label for="password">Password</label> <input type="password"
								class="form-control" name="password"
								placeholder=" Enter the Password"> <i
								class="bi bi-eye-slash" id="togglePassword"></i>
						</div>
					</div>


					<div class="row mt-5">
						<div class="text-center col-md-5 mb-4">
							<label for="address"> Address </label> <input type="address"
								class="form-control" name="address"
								placeholder=" Enter the  Address">
						</div>
						<div class="text-center col-md-5 mb-4">
							<label for="mobileno">Mobile No:</label> <input type="text"
								class="form-control" name="Mobile"
								placeholder=" Enter the Mobile No">
						</div>
					</div>
					
					<div class="card row">
					<div class="card-body">
					<p> your Address</p>
					<div  class="from-group">
					<input type="text" class="form-contrl" name="address1.street"placeholder="Enter the Street">
				
					</div>
					<div  class="from-group ">
					<input type="text" class="form-contrl" name="address1.city"placeholder="Enter the City">
				
					</div>
					
					</div>
					</div>
					
					
					
					

					<div class="row mt-5 ">
						<div class=" col-md-3 mb-4">
							<label for="date">your Date</label> <input type="text"
								name="date" placeholder="dd/mm/yyy">
							 <!-- <label for="birthdaytime">Birthday (date and time):</label> <input
								type="datetime-local" id="birthdaytime" name="date"> -->
							<!-- <input type="time" id="appt" name="appt"> -->
						</div>
					</div>
					<div class="text-center col-md-4 mb-3">
						<h4>Gender</h4>
						<label for="gender-male"> Male</label> <input type="radio"
							name="gender" value="male" id="gender-male"> <label
							for="gender-female"> Female</label> <input type="radio"
							name="gender" value="female" id="gender-female"> <label
							for="gender-other"> Other</label> <input type="radio"
							name="gender" value="other" id="gender-other">
					</div>
			</div>
			<div>
				<h4>Write the Comment</h4>
				<label></label>
				<textarea cols="50" rows="10"></textarea>
			</div>
			<div class="container text-center">
				<button class="btn btn-outline-light" name="submit">Submit</button>
			</div>
			</form>
		</div>


	</div>




	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>