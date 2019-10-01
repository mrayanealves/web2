package br.ufrn.imd.rayserva.repositorio;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.rayserva.dominio.Sala;

@Stateless
public class SalaRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Sala> getSalas() {
		return (List<Sala>) em.createQuery("select s from Sala s ").getResultList();
	}
	
	public void salvar(Sala Sala) {
		if (Sala.getId() == null) {
			em.persist(Sala);
		} else {
			em.merge(Sala);
		}
	}
	
	public void remover(Sala Sala) {
		Sala = em.find(Sala.class, Sala.getId());
		em.remove(Sala);
	}
	
	public Sala buscarSalaPorCodigo(String codigo) {
		try {
			String jpaql = "select s from Sala s where s.codigo = :codigo";
			Query query = em.createQuery(jpaql);
			
			return (Sala) query.getSingleResult();
			
		} catch (NoResultException e) {
			return null;
		}
	}
}
