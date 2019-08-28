package br.imd.ufrn.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.rh.Endereco;

/**
 * Classe que atua como um controle de recebimento do tipo transferência.
 * @author mrayanealves
 *
 */
public class ChecklistTransferencia {
	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String observacoes;
	private List<Documento> anexosFotos;
	private Boolean aprovado;
	
	public ChecklistTransferencia() {
	}

	public ChecklistTransferencia(Material material, BigDecimal qtd, Endereco local, Date dataConferencia) {
		this.material = material;
		this.qtd = qtd;
		this.local = local;
		this.dataConferencia = dataConferencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataConferencia == null) ? 0 : dataConferencia.hashCode());
		result = prime * result + ((local == null) ? 0 : local.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
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
		ChecklistTransferencia other = (ChecklistTransferencia) obj;
		if (dataConferencia == null) {
			if (other.dataConferencia != null)
				return false;
		} else if (!dataConferencia.equals(other.dataConferencia))
			return false;
		if (local == null) {
			if (other.local != null)
				return false;
		} else if (!local.equals(other.local))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtd() {
		return qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	public Endereco getLocal() {
		return local;
	}

	public void setLocal(Endereco local) {
		this.local = local;
	}

	public Date getDataConferencia() {
		return dataConferencia;
	}

	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Documento> getAnexosFotos() {
		return anexosFotos;
	}

	public void setAnexosFotos(List<Documento> anexosFotos) {
		this.anexosFotos = anexosFotos;
	}

	public Boolean getAprovado() {
		return aprovado;
	}

	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
}
