<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-3">File the Product Details</h1>
				<form action="handel-product" method="post">
					<div class="form-gorup">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter the Product Name Here">

					</div>

					<div class="form-group">
						<label for="description"> Product Description</label>
						<textarea rows="5" class="form-control" name="description"
							id="description" placeholder="Enter The Product Description"></textarea>
					</div>

					<div class="form-group">
						<label for="price"> Product price</label> <input type="text"
							name="price" placeholder="Enter The Product Price"
							class="form-control">
					</div>
					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>


					</div>

				</form>


			</div>


		</div>

	</div>
</body>
</html>