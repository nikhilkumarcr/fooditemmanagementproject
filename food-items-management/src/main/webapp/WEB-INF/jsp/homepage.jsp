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
<title>Home Page</title>
</head>
<body class="container">

	<h1 class="text-center">Food Kart</h1>
	<hr />
	<div class="text-center"><a href="additem" class="btn btn-light">Click Here to Add items</a></div><br><br>
	<div class="row">
		<div class="col-2"></div>
		<div class="col-8">

			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Number</th>
						<th>Name</th>
						<th>Type</th>
						<th>Price</th>
						<th>Availability</th>
						<th>Actions</th>
					</tr>
				</thead>

				<c:forEach items="${foodList}" var="item">
					<tr>
						<td>${item.getItemNumber()}</td>
						<td>${item.getItemName()}</td>
						<td>${item.getCuisine()}</td>
						<td>${item.getPrice()}</td>
						<td>${item.getAvailabality()}</td>
						
						<td><a href="edititem?id=${item.getItemNumber() }"
							class="btn btn-sm btn-dark">Edit</a> <a
							href="deleteitem?id=${item.getItemNumber() }"
							class="btn btn-sm btn-danger">Delete</a></td>

					</tr>
				</c:forEach>
			</table>

		</div>
		<div class="col-2"></div>
	</div>
</body>
</html>