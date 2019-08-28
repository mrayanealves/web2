package br.imd.ufrn.models;

import java.math.BigDecimal;
import java.util.Date;

import br.imd.ufrn.rh.PessoaJuridica;

/**
 * Classe com as informações das notas fiscais
 * @author mrayanealves
 *
 */
public class NotaFiscal {
	private Integer serieNF;
	private Integer numeroNF;
	private PessoaJuridica transportadora;
	private String motorista;
	private String placaVeiculo;
	private Date dataEmissao;
	private PessoaJuridica eminente;
	private PessoaJuridica destinatario;
	private BigDecimal valorTotal;
	
	public NotaFiscal() {
	}

	public NotaFiscal(Integer serieNF, Integer numeroNF, PessoaJuridica transportadora, String motorista,
			String placaVeiculo, PessoaJuridica eminente, PessoaJuridica destinatario, BigDecimal valorTotal) {
		this.serieNF = serieNF;
		this.numeroNF = numeroNF;
		this.transportadora = transportadora;
		this.motorista = motorista;
		this.placaVeiculo = placaVeiculo;
		this.eminente = eminente;
		this.destinatario = destinatario;
		this.valorTotal = valorTotal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroNF == null) ? 0 : numeroNF.hashCode());
		result = prime * result + ((serieNF == null) ? 0 : serieNF.hashCode());
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
		NotaFiscal other = (NotaFiscal) obj;
		if (numeroNF == null) {
			if (other.numeroNF != null)
				return false;
		} else if (!numeroNF.equals(other.numeroNF))
			return false;
		if (serieNF == null) {
			if (other.serieNF != null)
				return false;
		} else if (!serieNF.equals(other.serieNF))
			return false;
		return true;
	}

	public Integer getSerieNF() {
		return serieNF;
	}

	public void setSerieNF(Integer serieNF) {
		this.serieNF = serieNF;
	}

	public Integer getNumeroNF() {
		return numeroNF;
	}

	public void setNumeroNF(Integer numeroNF) {
		this.numeroNF = numeroNF;
	}

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public PessoaJuridica getEminente() {
		return eminente;
	}

	public void setEminente(PessoaJuridica eminente) {
		this.eminente = eminente;
	}

	public PessoaJuridica getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(PessoaJuridica destinatario) {
		this.destinatario = destinatario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
}
