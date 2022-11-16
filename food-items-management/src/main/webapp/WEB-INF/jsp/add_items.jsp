<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="display-1">Add Items</div>
	<hr />
	
<div class="row">
		<div class="col-8">
			<div class="card">
				<div class="card-header">Add Item Form</div>
				<div class="card-body">
					<form action="display_items">
						<div class="form-group">
							<label class="form-control-label" for="item_number">Item Number</label> <input
								type="text" class="form-control" id="item_number"
								placeholder="Item_number" name="item_number" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="item_name">Item Name</label> <input
								type="text" class="form-control" id="item_name"
								placeholder="Item_name" name="source" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="cuisine">Cuisine</label>
							<input type="text" class="form-control" id="cuisine"
								placeholder="Cuisine" name="cuisine" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="price">Price</label>
							<input type="text" class="form-control" id="price"
								placeholder="Price" name="price" />
						</div>
						<div class="form-group">
							<label class="form-control-label" for="availabality">Availabality</label>
							<input type="text" class="form-control" id="availabality"
								placeholder="Availabality" name="availabality" />
						</div>
						<hr />
						<button type="submit" class="btn btn-primary">Add item</button>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>