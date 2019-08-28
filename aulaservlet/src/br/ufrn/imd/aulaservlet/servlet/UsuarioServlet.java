package br.ufrn.imd.aulaservlet.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.aulaservlet.dominio.Usuario;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/paginas/usuarios")
public class UsuarioServlet extends HttpServlet {
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("usuarios") == null) {	
			request.getSession().setAttribute("usuarios", this.usuarios);
		}
		
		response.sendRedirect("/aulaservlet/paginas/usuarios.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("usuarios") != null) {
			this.usuarios = (List<Usuario>) request.getSession().getAttribute("usuarios");
		}
		
		Usuario usuario = new Usuario();
		usuario.setNome(request.getParameter("nome"));
		usuario.setLogin(request.getParameter("login"));
		usuario.setSenha(request.getParameter("senha"));
		
		this.usuarios.add(usuario);
		
		request.getSession().setAttribute("usuarios", this.usuarios);
		response.sendRedirect("/aulaservlet/paginas/usuarios.jsp");
	}

}
