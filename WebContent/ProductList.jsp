<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Product List</title>
</head>
<body>

	<center>
		<h2>Product List</h2>


	</center>



	<table border="2px" cellpadding="5px">
	
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Price</th>


		</tr>


		<c:forEach var="product" items="${products}">
			<tr>
				<td><a href="ProductServlet?productId=${product.productId}">${product.productId}</a></td>
				<td>${product.productName}</td>
				<td>${product.unitPrice}</td>


			</tr>
		</c:forEach>


	</table>



</body>
</html>