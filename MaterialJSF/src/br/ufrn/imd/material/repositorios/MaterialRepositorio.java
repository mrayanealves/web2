package br.ufrn.imd.material.repositorios;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.ufrn.imd.material.dominio.Material;

@Stateless
public class MaterialRepositorio {
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Material> getMateriais() {
		return (List<Material>) em.createQuery("select m from Material m ").getResultList();
	}
	
	public void salvar(Material material) {
		if (material.getId() == null) {
			em.persist(material);
		} else {
			em.merge(material);
		}
	}
	
	public void remover(Material material) {
		material = em.find(Material.class, material.getId());
		em.remove(material);
	}
	
	@SuppressWarnings("unchecked")
	public List<Material> buscarMaterialPorUsuario(String login) {
		String jpaql = "select m from Material m where m.usuarioCadastro.login = :login";
		
		Query query = em.createQuery(jpaql);
		query.setParameter("login", login);
		
		return (List<Material>) query.getResultList();
	}
	
	public Material buscarMaterialPorCodigo(String codigo) {
		try {
			String jpaql = "select m from Material m where m.codigo = :codigo";
			Query query = em.createQuery(jpaql);
			
			return (Material) query.getSingleResult();
			
		} catch (NoResultException e) {
			return null;
		}
	}
}
