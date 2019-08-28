package br.ufrn.imd.aulaservlet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/logar")
public class LoginServlet extends HttpServlet {       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (login.equals("mrayanealves") && senha.equals("mrayanealves")) {
			Usuario usuario = new Usuario();
			usuario.setNome("Maria Rayane");
			request.getSession().setAttribute("usuario", usuario);
			response.sendRedirect("/aulaservlet/paginas/conteudo.jsp");
		} else {
			response.sendRedirect("/aulaservlet/login.jsp");
		}
	}
}
