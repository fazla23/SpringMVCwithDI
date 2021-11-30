<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Employee Management System</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
   <hr>
<div class="container">
    <h3>Update Item</h3>
     <form action="${pageContext.request.contextPath }/updateItem/${item.id}" method="POST">

        <div class="row">
            <div class="form-group col-lg-6">
                <label >Item Name</label>
                <input type="text" placeholder="Item Name" class="form-control"  value="${item.itemName}" name="itemName">
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Item Price</label>
                <input type="number" placeholder="Item Price" class="form-control" value="${item.itemPrice}" name="itemPrice" >
            </div>
        </div>
        <div class="row">
            <div class="form-group col-lg-6">
                <label >Item Quantity</label>
                <input type="number" placeholder="Item Quantity" class="form-control" value="${item.quantity}" name="quantity">
            </div>
        </div>
        <button type="submit" class="btn btn-primary" >Submit</button>
    </form>
</div>
</body>
</body>
</html>