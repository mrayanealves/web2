package br.ufrn.imd.material.repositorios;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.ufrn.imd.material.dominio.Usuario;

@Stateless
public class UsuarioRepositorio {
	@PersistenceContext
	private EntityManager em;

	public Usuario getUsuario(String login, String senha) {
		try {
			Query query = em.createQuery("select u from Usuario u "
					+ "where login = :login and senha = :senha");
			query.setParameter("login", login);
			query.setParameter("senha", senha);
			
			return (Usuario) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
//	private static List<Usuario> usuarios;
//	
//	public static Usuario getUsuario(String login, String senha) {
//		Usuario usuarioRetorno = null;
//		if (usuarios == null) {
//			usuarios = new ArrayList<Usuario>();
//			
//			Usuario usuario = new Usuario("mrayanealves", "mrayanealves");
//			usuarios.add(usuario);
//		}
//		
//		for (Usuario usuario : usuarios) {
//			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
//				usuarioRetorno = usuario;
//			}
//		}
//		
//		return usuarioRetorno;
//	}
}
