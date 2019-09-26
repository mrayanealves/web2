
package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.dominio.Usuario;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Named
@SessionScoped
public class MaterialMBean implements Serializable {

	private Material material;
	
	private DataModel<Material> materiaisModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	@Inject
	private MaterialRepositorio materialRepositorio;
	

	public MaterialMBean() {
		material = new Material();
	}
	public String novoMaterial() {
		material = new Material();
		return "/pages/material/form.jsf";
	}	
	public String listarMateriais() {
		materiaisModel = new ListDataModel<Material> (materialRepositorio.getMateriais());
		return "/pages/material/list.jsf";
	}
	public String listarMateriaisPorUsuario() {
		materiaisModel = new ListDataModel<Material> (materialRepositorio.buscarMaterialPorUsuario(usuarioMBean.getUsuarioLogado().getLogin()));
		return "/pages/material/list.jsf";
	}
	public String cadastrarMaterial() {
		material.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		materialRepositorio.salvar(material);
		material = new Material();
		return "/pages/material/form.jsf";
	}
	public String removerMaterial() {
		Material materialRemovido = materiaisModel.getRowData();
		materialRepositorio.remover(materialRemovido);
		return listarMateriais();
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public DataModel<Material> getMateriaisModel() {
		return materiaisModel;
	}

	public void setMateriaisModel(DataModel<Material> materiaisModel) {
		this.materiaisModel = materiaisModel;
	}

}