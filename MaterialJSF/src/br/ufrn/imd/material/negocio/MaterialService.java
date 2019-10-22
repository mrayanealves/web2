package br.ufrn.imd.material.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.dominio.Usuario;
import br.ufrn.imd.material.exception.NegocioException;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Stateless
public class MaterialService {
	@Inject MaterialRepositorio materialRepositorio;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Material adicionarMaterial(Material material) throws NegocioException {
		Material materialBanco = materialRepositorio.buscarMaterialPorCodigo(material.getCodigo());
		
		if (materialBanco == null || material.getId() > 0) {
			materialRepositorio.salvar(material);
		} else {
			throw new NegocioException("Material existente.");
		}
		
		return material;
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void removerMaterial(Material material) {
		materialRepositorio.remover(material);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Material> listarMaterial(){
		return materialRepositorio.getMateriais();
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public List<Material> listarMaterialPorUsuario(String loginUsuario){
		return materialRepositorio.buscarMaterialPorUsuario(loginUsuario);
	}
}
