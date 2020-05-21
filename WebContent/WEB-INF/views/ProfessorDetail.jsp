<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Professor</title>
</head>
<body>

	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<form action="/ProjetoProva/professorUpdate" method="POST" modelAttribute="professor">
			<form:hidden path="professor.id" />
			<p>
				Nome:
				<form:input path="professor.nome" />
				
			</p>

			<p>
				E-Mail:
				<form:input path="professor.email" />
				
			</p>
			
			<p>
				Telefone:
				<form:input path="professor.telefone" />
				
			</p>

			<p>
				Data de Nascimento:
				<form:input path="professor.dataNasc" />
			</p>

			<input type="submit" value="Salvar" />

		</form>
	</div>

	<a href="/ProjetoProva/professores"> Voltar</a>
</body>
</html>