package br.ufrn.imd.material.repositorios;

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
}
