<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">
<title>Home page</title>
</head>
<body class="container">

<form>

<table class="table">

				<c:forEach var="items" items="${items}">
					<tr>
						<td>${items.getItemNumber() }</td>
						<td>${items.getItemName() }</td>
						<td>${teams.getCuisine() }</td>
						<td>${teams.getPrice() }</td>
						<td>${teams.getAvailabality() }</td>
						<a href="delete_item" class="btn btn-danger">delete</a>

					</tr>
				</c:forEach>
			</table>


</form>

</body>
</html>