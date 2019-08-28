package br.imd.ufrn.models;

import java.util.Date;

/**
 * Classe com os dados do frete
 * @author mrayanealves
 *
 */
public class DadosFrete {
	private Date dataSaida;
	private String nomeTransportador;
	private String placaVeiculo;
	private String municipio;
	private String uf;
	private Boolean fretePagoPorEmitente;
	
	public DadosFrete() {
	}

	public DadosFrete(Date dataSaida, String nomeTransportador, String placaVeiculo, String municipio, String uf) {
		this.dataSaida = dataSaida;
		this.nomeTransportador = nomeTransportador;
		this.placaVeiculo = placaVeiculo;
		this.municipio = municipio;
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataSaida == null) ? 0 : dataSaida.hashCode());
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((nomeTransportador == null) ? 0 : nomeTransportador.hashCode());
		result = prime * result + ((placaVeiculo == null) ? 0 : placaVeiculo.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		DadosFrete other = (DadosFrete) obj;
		if (dataSaida == null) {
			if (other.dataSaida != null)
				return false;
		} else if (!dataSaida.equals(other.dataSaida))
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (nomeTransportador == null) {
			if (other.nomeTransportador != null)
				return false;
		} else if (!nomeTransportador.equals(other.nomeTransportador))
			return false;
		if (placaVeiculo == null) {
			if (other.placaVeiculo != null)
				return false;
		} else if (!placaVeiculo.equals(other.placaVeiculo))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getNomeTransportador() {
		return nomeTransportador;
	}

	public void setNomeTransportador(String nomeTransportador) {
		this.nomeTransportador = nomeTransportador;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Boolean getFretePagoPorEmitente() {
		return fretePagoPorEmitente;
	}

	public void setFretePagoPorEmitente(Boolean fretePagoPorEmitente) {
		this.fretePagoPorEmitente = fretePagoPorEmitente;
	}
}
