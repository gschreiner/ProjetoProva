<%@page import="models.Professor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Disciplinas</title>
</head>
<body>

	<div
		style="position: relative; display: inline-block; width: 80%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<h2>Descrição</h2>

		<p>Voce deverá criar uma tela que apresente as disciplinas
			cadastradas e permita cadastrar novas (aos moldes da tela de
			Professores)</p>
		<p>Uma disciplina possui: nome (String), carga horária (inteiro),
			data de início (data), máximo de participantes (inteiro) e um
			professor titular (Professor).</p>
		<p>Além do cadastro o sistema deve possuir as features de
			apresentar com detalhes uma disciplina (nos padroes do feito em
			professores), e deve ser capaz de editar as informações da
			disciplina.</p>
		<p>Uma feature que não é obrigatória mas seria interessante para o
			sistema é  a possibilidade de excluir uma discplina.</p>

		<p>Lembresse de desenvolver tudo levando em consideração o padrão
			MVC e de apresentar todas as features obrigatórias. Seja criativo(a),
			um sistema com diferenciais terá uma nota diferenciada :).</p>
			
		<p> OBS: Pode apagar toda esta descrição e criar a página neste aquivo.</p>
	</div>



	<div
		style="position: relative; display: inline-block; width: 70%; margin-bottom: 40px; margin-left: 15%; border-collapse: collapse;">
		<form action="MicroCad" method="GET">
			<p>Para não dizer que não ajudo em nada, aqui tem um exemplo de
				como criar o combobox para selecionar um professor</p>

			<%
				List<Professor> professores;
				if (session.getAttribute("professores") == null) {
					professores = new ArrayList<Professor>();
					session.setAttribute("professores", professores);
				} else
					professores = (ArrayList<Professor>) session.getAttribute("professores");
			%>
			<% if (professores.size() > 0){ %>
				<select name="select">
					<% for (int i=0; i < professores.size();i++){ %>
						<option value="<%= i%>"><%= professores.get(i).getNome()%></option>
					<%}%>
				</select>
			<%}%>	
			<!--             <input type="submit" value="Cadastrar" /> -->

		</form>
	</div>
	
	<a href="Index.jsp"> Voltar</a>

</body>
</html>