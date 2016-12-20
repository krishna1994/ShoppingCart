<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<body>

	<center>
		<h2>Product Detail</h2>

	</center>
	<% 
if(session.getAttribute("username")!=null)
{ 
String username=(String)session.getAttribute("username"); 
out.print("Welcome  "+username); 
} 
%> 

	<form name="form1" action="AddToCartServlet" method="post">
		<table border="2px" cellpadding="5px" height="100" width="1000">

			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Price</th>
				
				<th>About Product</th>
				<th>Quantity</th>


			</tr>


			<tr>

				<td>${productBean.productId}</td>
				<td>${productBean.productName}</td>
				<td>${productBean.unitPrice}</td>
				<td>${productBean.description}</td>
				<td><input type="text" name="quantity"/></td>
				<td><input type="submit" value="AddToCart"></input></td>


			</tr>

		</table>


	</form>

</body>
</html>