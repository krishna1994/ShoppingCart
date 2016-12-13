<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Login Page</title>
 
 </head>
 <body>

<form name="form1" action="LoginServlet" method="post">

<table align="center">
<tr>
<td>USERNAME</td>
<td><input type="text" name="username"  /></td>
</tr>

<tr>
<td>PASSWORD</td>
<td><input type="password" name="password"  /></td>
 </tr>

<tr>

<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
 </tr>
<tr>
<td></td>

<td><input type="submit" value="Login"></input><input type="reset" value="Reset"></input></td>
 </tr>
 </table>

 </form>


</body>
 </html>