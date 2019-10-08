package br.ufrn.imd.rayserva.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufrn.imd.rayserva.dominio.Sala;
import br.ufrn.imd.rayserva.repositorio.SalaRepositorio;

@Named
@SessionScoped
public class SalaMBean implements Serializable {
	private Sala sala;
	
	private DataModel<Sala> salasModel;
	
	@Inject
	private SalaRepositorio salaRepositorio;
	
	public String novaSala() {
		sala = new Sala();
		return "/paginas/sala/form.jsf";
	}	
	
	public String listarSalas() {
		salasModel = new ListDataModel<Sala> (salaRepositorio.getSalas());
		return "/paginas/sala/list.jsf";
	}

	public String cadastrarSala() {
		salaRepositorio.salvar(sala);
		sala = new Sala();
		return "/paginas/sala/form.jsf";
	}
	
	public String removerMaterial() {
		Sala reservaRemovido = salasModel.getRowData();
		salaRepositorio.remover(reservaRemovido);
		return listarSalas();
	}
	
	public Sala getSala() {
		return sala;
	}
	
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	public DataModel<Sala> getSalasModel() {
		return salasModel;
	}
	
	public void setSalasModel(DataModel<Sala> salasModel) {
		this.salasModel = salasModel;
	}
}
