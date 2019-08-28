package br.imd.ufrn.models;

/**
 * Classe que representa as unidades de medida dos materiais
 * @author mrayanealves
 *
 */
public class UnidadeMedida {
	private String nome;
	private String abreveacao;
	
	public UnidadeMedida() {
	}

	public UnidadeMedida(String nome, String abreveacao) {
		this.nome = nome;
		this.abreveacao = abreveacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abreveacao == null) ? 0 : abreveacao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		UnidadeMedida other = (UnidadeMedida) obj;
		if (abreveacao == null) {
			if (other.abreveacao != null)
				return false;
		} else if (!abreveacao.equals(other.abreveacao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAbreveacao() {
		return abreveacao;
	}

	public void setAbreveacao(String abreveacao) {
		this.abreveacao = abreveacao;
	}
}
