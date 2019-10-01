package br.ufrn.imd.rayserva.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import br.ufrn.imd.rayserva.enums.EnumTipoSala;

@Entity
@Table(name="sala")
public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SALA")
	@SequenceGenerator(name = "SEQ_SALA", sequenceName = "seq_id_sala", allocationSize = 1)
	private Integer id;
	
	@NotBlank
	@Column(unique = true)
	private String codigo;
	
	private Integer quantidadePessoas;
	
	@Enumerated(EnumType.STRING)
	private EnumTipoSala tipoSala;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	public EnumTipoSala getTipoSala() {
		return tipoSala;
	}

	public void setTipoSala(EnumTipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Sala other = (Sala) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
