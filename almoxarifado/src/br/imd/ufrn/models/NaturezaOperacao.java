package br.imd.ufrn.models;

/**
 * Classe com os dados da natureza da operação no estoque
 * @author mrayanealves
 *
 */
public class NaturezaOperacao {
	private String nome;
	private String descricao;
	private String codigo;
	
	public NaturezaOperacao() {
	}

	public NaturezaOperacao(String nome, String descricao, String codigo) {
		this.nome = nome;
		this.descricao = descricao;
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		NaturezaOperacao other = (NaturezaOperacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
}
