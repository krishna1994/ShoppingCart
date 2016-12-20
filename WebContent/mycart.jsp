<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>My Cart</h2>

	</center>


	<form name="form1" action="" method="post">
		<table border="2px" cellpadding="5px" height="100" width="1000">

			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Quantity</th>
				<th>Item Price</th>
				<th>Total Price</th>



			</tr>
			
				<c:forEach var="product" items="${products}">
					<tr>


					</tr>
				</c:forEach>

			

		</table>

		<a href="ProductList.jsp">Continue shopping</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Submit">

	</form>

</body>
</html>