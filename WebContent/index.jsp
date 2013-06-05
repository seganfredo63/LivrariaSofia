<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "Controller.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Sofia" method="get">

	<fieldset>
	<legend>Coleção: </legend>
		<label for="colecao1">Coleção: </label>
		<input type="text" id="colecao1" name="colecao1" />
		<br/>
		<label for="numLivros">: Número de livros</label>
		<input type="text" id="numLivros1" name="numLivros1" />
		<br/>
		<label for="titulo1">Título: </label>
		<input type="text" id="titulo1" name="titulo1" />
		<br/>		
		<label for="autor1">Autor: </label>
		<input type="text" id="autor1" name="autor1" />
		<br/>
		<label for="descricao1">Descrição: </label>
		<br/>
		<textarea id="descricao1" name="descricao1"></textarea>
	</fieldset>
	
	
	<input type="submit" value="Enviar" />
</form>
</body>
</html>