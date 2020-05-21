<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Professores</title>
</head>
<body>
	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<table border="2" width="70%" cellpadding="2">
			<tr>
				<th>Nome</th>
				<th>email</th>
				<th>Telefone</th>
				<th>Data Nascimento</th>
			</tr>
			<c:forEach var="p" items="${listProfessores}">
				<tr>
					<td>${p.nome}</td>
					<td>${p.email}</td>
					<td>${p.telefone}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${p.dataNasc}" /></td>
					<td><a href="professorDetail/${p.id}">Edit</a></td>
					<td><a href="professorDelete/${p.id}">Del</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div
		style="position: relative; display: inline-block; width: 50%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<form action="professorSave" method="POST" modelAttribute="professor">
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

			<input type="submit" value="Adicionar" />

		</form>
	</div>


<a href="/ProjetoPROVAAAA">voltar</a>

</body>

</html>