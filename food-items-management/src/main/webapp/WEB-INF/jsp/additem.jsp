<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.fooditems.model.FoodItem"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<title>Add Items</title>
</head>
<body class="container">

<br><br>
<div >
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-primary">Add New Food Item</h4>
						<p class="text-center text-danger">* Items Entry is Compulsory</p>

						<form action="addingitem" method="post">
							
							<div class="form-group">
								Enter Item Number<input type="text"
									class="form-control" name="itemNumber" value="${id }" readonly>
							</div>
							<div class="form-group">
								Enter Item Name<input type="text"
									class="form-control" name="itemName">
							</div>

							<div class="form-group">
							Enter Item Cuisine <input type="text"
									class="form-control" name="cuisine">
							</div>

							<div class="form-group">
								Enter Item Price<input type="text"
									class="form-control" name="price">
							</div>


							<div class="form-group">
								Availability<input type="text"
									class="form-control" name="availabality">
							</div>
                             <br>
							<div><button type="submit" value="submit" class="btn btn-success">Add Item</button></div>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>




</body>
</html>