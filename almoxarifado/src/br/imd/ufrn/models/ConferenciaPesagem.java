package br.imd.ufrn.models;

import java.util.Date;

/**
 * Classe que atua como um verificador de conferência de passagem.
 * @author mrayanealves
 *
 */
public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private Integer numeroVolumes;
	private Double taraKg;
	private Integer pesoVolumes;
	private Boolean executado;
	private Boolean conferido;
	
	public ConferenciaPesagem() {
	}

	public ConferenciaPesagem(Date data, LoteMaterial lote) {
		this.data = data;
		this.lote = lote;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
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
		ConferenciaPesagem other = (ConferenciaPesagem) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		return true;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Integer getNumeroVolumes() {
		return numeroVolumes;
	}

	public void setNumeroVolumes(Integer numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}

	public Double getTaraKg() {
		return taraKg;
	}

	public void setTaraKg(Double taraKg) {
		this.taraKg = taraKg;
	}

	public Integer getPesoVolumes() {
		return pesoVolumes;
	}

	public void setPesoVolumes(Integer pesoVolumes) {
		this.pesoVolumes = pesoVolumes;
	}

	public Boolean getExecutado() {
		return executado;
	}

	public void setExecutado(Boolean executado) {
		this.executado = executado;
	}

	public Boolean getConferido() {
		return conferido;
	}

	public void setConferido(Boolean conferido) {
		this.conferido = conferido;
	}
}
