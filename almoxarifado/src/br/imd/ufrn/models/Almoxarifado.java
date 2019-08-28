package br.imd.ufrn.models;

import java.util.ArrayList;
import java.util.List;

import br.imd.ufrn.enums.TipoMaterial;

/**
 * Classe que atua como a representação de um almoxarifado.
 * @author mrayanealves
 *
 */
public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tipoMateriais;
	private List<Usuario> usuariosAlmoxarifado;
	private Boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;
	
	public Almoxarifado() {
		this.tipoMateriais = new ArrayList<TipoMaterial>();
		this.usuariosAlmoxarifado = new ArrayList<Usuario>();
		this.localizacoes = new ArrayList<LocalizacaoAlmoxarifado>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chefe == null) ? 0 : chefe.hashCode());
		result = prime * result + ((enderecado == null) ? 0 : enderecado.hashCode());
		result = prime * result + ((localizacoes == null) ? 0 : localizacoes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipoMateriais == null) ? 0 : tipoMateriais.hashCode());
		result = prime * result + ((usuariosAlmoxarifado == null) ? 0 : usuariosAlmoxarifado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Almoxarifado other = (Almoxarifado) obj;
		if (chefe == null) {
			if (other.chefe != null)
				return false;
		} else if (!chefe.equals(other.chefe))
			return false;
		if (enderecado == null) {
			if (other.enderecado != null)
				return false;
		} else if (!enderecado.equals(other.enderecado))
			return false;
		if (localizacoes == null) {
			if (other.localizacoes != null)
				return false;
		} else if (!localizacoes.equals(other.localizacoes))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tipoMateriais == null) {
			if (other.tipoMateriais != null)
				return false;
		} else if (!tipoMateriais.equals(other.tipoMateriais))
			return false;
		if (usuariosAlmoxarifado == null) {
			if (other.usuariosAlmoxarifado != null)
				return false;
		} else if (!usuariosAlmoxarifado.equals(other.usuariosAlmoxarifado))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getChefe() {
		return chefe;
	}

	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}

	public List<TipoMaterial> getTipoMateriais() {
		return tipoMateriais;
	}

	public void setTipoMateriais(List<TipoMaterial> tipoMateriais) {
		this.tipoMateriais = tipoMateriais;
	}

	public List<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}

	public void setUsuariosAlmoxarifado(List<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}

	public Boolean getEnderecado() {
		return enderecado;
	}

	public void setEnderecado(Boolean enderecado) {
		this.enderecado = enderecado;
	}

	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}
}
