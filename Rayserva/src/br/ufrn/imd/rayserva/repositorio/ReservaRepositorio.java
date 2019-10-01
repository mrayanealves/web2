package br.ufrn.imd.rayserva.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.rayserva.dominio.Reserva;

@Stateless
public class ReservaRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Reserva> getReservas() {
		return (List<Reserva>) em.createQuery("select r from Reserva r ").getResultList();
	}
	
	public void salvar(Reserva Reserva) {
		if (Reserva.getId() == null) {
			em.persist(Reserva);
		} else {
			em.merge(Reserva);
		}
	}
	
	public void remover(Reserva Reserva) {
		Reserva = em.find(Reserva.class, Reserva.getId());
		em.remove(Reserva);
	}
	
	@SuppressWarnings("unchecked")
	public List<Reserva> buscarReservaPorUsuario(String login) {
		String jpaql = "select r from Reserva r where r.usuario.login = :login";
		
		Query query = em.createQuery(jpaql);
		query.setParameter("login", login);
		
		return (List<Reserva>) query.getResultList();
	}
	
	public Reserva buscarReservaPorCodigo(String codigo) {
		try {
			String jpaql = "select r from Reserva r where r.codigo = :codigo";
			Query query = em.createQuery(jpaql);
			
			return (Reserva) query.getSingleResult();
			
		} catch (NoResultException e) {
			return null;
		}
	}
}
