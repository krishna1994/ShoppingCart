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


<form name="form1" action="AddToCartServlet" method="post">
	<table border="2px" cellpadding="5px">

		<tr bgcolor="red">
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>About Product</th>


		</tr>


		<%-- <c:forEach var="productBean" items="${productBean}"> --%>
			<tr>
				<%-- <td><a href="ProductServlet?productId=${product.productId}">${product.productId}</a></td> --%>
				<td>${productBean.productId}</td>
				<td>${productBean.productName}</td>
				<td>${productBean.unitPrice}</td>
				<td>${productBean.description}</td>
<td><input type="submit" value="AddToCart"></input></td>


			</tr>
		
	</table>


</form>

</body>
</html>