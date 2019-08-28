<%@page import="br.ufrn.imd.aulaservlet.dominio.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<div>
		<div>
			<div>
				<div>
					<form action="../sair" method="get">
						<p><input type="submit" value="Sair"></p>
					</form>
				</div>
	
				<div>
					<form action="usuarios" method="get">
						<p><input type="submit" value="Ver usuarios"></p>
					</form>
				</div>
			</div>
		</div>
		<div>
			<p> Hello, 
				<b><%= ((Usuario) session.getAttribute("usuario")).getNome() %></b>
			</p>
		</div>
	</div>
</body>
</html>