package br.ufrn.imd.rayserva.filtros;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ufrn.imd.rayserva.dominio.Usuario;

@WebFilter("/pages/*")
public class SegurancaFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		Usuario usuarioLogado = (Usuario) 
				req.getSession().getAttribute("usuarioLogado");
		
		if (usuarioLogado == null) 
			res.sendRedirect("/rayserva/index.jsf");
		else 
			chain.doFilter(request, response);
	}
}
