
package br.ufrn.imd.material.controllers;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.RequestMap;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;

import br.ufrn.imd.material.dominio.Material;
import br.ufrn.imd.material.dominio.Usuario;
import br.ufrn.imd.material.exception.NegocioException;
import br.ufrn.imd.material.negocio.MaterialService;
import br.ufrn.imd.material.repositorios.MaterialRepositorio;

@Named
@SessionScoped
public class MaterialMBean implements Serializable {

	private Material material;
	
	private DataModel<Material> materiaisModel;
	
	@Inject
	private UsuarioMBean usuarioMBean;
	
	@EJB
	private MaterialService materialService;

	public MaterialMBean() {
		material = new Material();
	}
	public String novoMaterial() {
		material = new Material();
		return "/pages/material/form.jsf";
	}	
	public String listarMateriais() {
		materiaisModel = new ListDataModel<Material> (materialService.listarMaterial());
		return "/pages/material/list.jsf";
	}
	public String listarMateriaisPorUsuario() {
		materiaisModel = new ListDataModel<Material> (materialService.listarMaterialPorUsuario(usuarioMBean.getUsuarioLogado().getLogin()));
		return "/pages/material/list.jsf";
	}
	public String cadastrarMaterial() {
		material.setUsuarioCadastro(usuarioMBean.getUsuarioLogado());
		
		try {
			materialService.adicionarMaterial(material);
		} catch (NegocioException e) {
			FacesMessage msg = new FacesMessage(e.getMessage());
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			FacesContext.getCurrentInstance().addMessage("", msg);
			return null;
		}
		
		material = new Material();
		return "/pages/material/form.jsf";
	}
	public String removerMaterial() {
		Material materialRemovido = materiaisModel.getRowData();
		materialService.removerMaterial(materialRemovido);
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