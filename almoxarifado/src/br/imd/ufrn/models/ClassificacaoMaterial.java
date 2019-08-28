package br.imd.ufrn.models;

/**
 * Classe que indica as possíveis classificações de materiais.
 * @author mrayanealves
 *
 */
public class ClassificacaoMaterial {
	private String nome;
	private String codigo;
	
	public ClassificacaoMaterial() {
		
	}

	public ClassificacaoMaterial(String nome, String codigo) {
		this.nome = nome;
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
		ClassificacaoMaterial other = (ClassificacaoMaterial) obj;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
