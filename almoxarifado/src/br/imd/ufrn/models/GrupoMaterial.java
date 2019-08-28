package br.imd.ufrn.models;

import br.imd.ufrn.enums.TipoMaterial;

/**
 * Classe com os grupos dos materiais
 * @author mrayanealves
 *
 */
public class GrupoMaterial {
	private String nome;
	private String descricao;
	private String codigo;
	private TipoMaterial tipo;
	
	public GrupoMaterial() {

	}

	public GrupoMaterial(String nome, String descricao, String codigo, TipoMaterial tipo) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		GrupoMaterial other = (GrupoMaterial) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoMaterial getTipo() {
		return tipo;
	}

	public void setTipo(TipoMaterial tipo) {
		this.tipo = tipo;
	}
}
