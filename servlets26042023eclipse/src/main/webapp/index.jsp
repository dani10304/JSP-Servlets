<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Servlets en Java EE</h2>
<%= new Date() %>
<form method="post" action="CalcularServlet">
<input type="text" name="nombre" placeholder="Dime tu nombre"><br>
<input type="number" name="clases" placeholder="Dime las clases semanales"><br>
<input type="text" name="perfil" placeholder="Dime tu perfil"><br>
<input type="number" name="competiciones" placeholder="Competiciones mensuales"><br>
<input type="submit" value="Calcular cuota mensual">
</form>
</body>
</html>