<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Datos" method="post">
  <fieldset>
    <legend>Información del Producto</legend>
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required aria-required="true" aria-label="ID del producto">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required aria-required="true" aria-label="Nombre del producto">
    <label for="unidades">Unidades:</label>
    <input type="number" id="unidades" name="unidades" required aria-required="true" aria-label="Unidades">
	<label for="unidades">Unidades:</label>
    <input type="number" id="unidades" name="unidades" required aria-required="true" aria-label="Unidades del producto" min="1">
    <label for="precio">Precio:</label>
    <input type="number" id="precio" name="precio" required aria-required="true" aria-label="Precio del producto" step=".01" min="0">
  </fieldset>
  <button type="submit">Enviar</button>
</form>
</body>
</html>