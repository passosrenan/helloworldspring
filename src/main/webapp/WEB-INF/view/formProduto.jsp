
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.principal{
text-align: -webkit-center;
border-style: radius;

}








</style>
<body>
<h1>Formulário de cadastro</h1>
<section class="principal">
	<form class="formulario" action="salvarProduto">
	<table>
	<tr>
		<td><label>Nome:</label></td>
	 	<td><input type="text" name="nome"></input></td>
	 </tr>
	 <tr>
	 	<td><label>Validade:</label></td>
	 	<td><input type="date" name="dataValidade"></input></td>
	 </tr>
	 <tr>
	 	<td><label>Preço:</label></td>
	 	<td><input type="text" name="preco"></input></td>
	 </tr>
	 <tr>
	 	<td><label>Estoque:</label></td>
	 	<td><input type="number" name="estoque"></input></td>
	 </tr>
	 <tr>
	 	<td><label>Tipo do Produto:</label></td>
	 	<td>
	 		<select name="tipoProduto">
	 			<c:forEach items="${tipos}" var="t">
	 				<option value="${t}">${t.toString()}</option>
	 				
	 			
	 			</c:forEach>
	 		
	 		</select>
	 	</td>
	 </tr>
	 	<tr class="butao">
	 		<td><button class="button"type="submit">Salvar</button></td>
	 	</tr> 
	</table>
	</form>
</section>

</body>
</html>