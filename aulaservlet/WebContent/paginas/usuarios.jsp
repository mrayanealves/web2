<%@page import="br.ufrn.imd.aulaservlet.dominio.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Usuarios</title>
</head>
<body>
	<div>
		<div>
			<form action="usuarios" method="post">
				<p><input type="text" name="nome" placeholder="Nome do usuário" required></p>
				<p><input type="text" name="login" placeholder="Login do usuário" required></p>
				<p><input type="text" name="senha" placeholder="Senha do usuário" required></p>
				
				<p><input type="submit" value="Salvar"></p>
			</form>
		</div>
		<div>
			<%
			List<Usuario> usuarios = (List<Usuario>)session.getAttribute("usuarios");
			for (Usuario u : usuarios) {
			%>
				<p> <%= u.getLogin() %> - <%= u.getNome() %> <br/></p>
			<% } %>
		</div>
	</div>
</body>
</html>