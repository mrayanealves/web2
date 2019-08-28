package br.imd.ufrn.models;

import java.util.Date;
import java.util.List;

import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.rh.Funcionario;

/**
 * Classe que atua como um controle de recebimento do tipo comum.
 * @author mrayanealves
 *
 */
public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private Boolean materialConfereNF;
	private Boolean etiquetadoIdentificacao;
	private Boolean embalagemIntegra;
	private Boolean embalagemSuja;
	private Boolean embalagemUmida;
	private Boolean embalagemDeformada;
	private Boolean embalagemVazada;
	private Boolean embalagemLacreViolado;
	private String placa;
	private Float temperatura;
	private Integer numeroConhecimento;
	private String motorista;
	private String observacoes;
	private Funcionario conferente;
	private List<Documento> anexosFotos;
	private Boolean aprovado;
	
	public ChecklistRecebimentoComum() {
	}

	public ChecklistRecebimentoComum(Date dataChegada, LoteMaterial lote, Boolean etiquetadoIdentificacao, String placa,
			Float temperatura, Integer numeroConhecimento, String motorista) {
		this.dataChegada = dataChegada;
		this.lote = lote;
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
		this.placa = placa;
		this.temperatura = temperatura;
		this.numeroConhecimento = numeroConhecimento;
		this.motorista = motorista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataChegada == null) ? 0 : dataChegada.hashCode());
		result = prime * result + ((etiquetadoIdentificacao == null) ? 0 : etiquetadoIdentificacao.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
		result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
		ChecklistRecebimentoComum other = (ChecklistRecebimentoComum) obj;
		if (dataChegada == null) {
			if (other.dataChegada != null)
				return false;
		} else if (!dataChegada.equals(other.dataChegada))
			return false;
		if (etiquetadoIdentificacao == null) {
			if (other.etiquetadoIdentificacao != null)
				return false;
		} else if (!etiquetadoIdentificacao.equals(other.etiquetadoIdentificacao))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (motorista == null) {
			if (other.motorista != null)
				return false;
		} else if (!motorista.equals(other.motorista))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Boolean getMaterialConfereNF() {
		return materialConfereNF;
	}

	public void setMaterialConfereNF(Boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}

	public Boolean getEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}

	public void setEtiquetadoIdentificacao(Boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}

	public Boolean getEmbalagemIntegra() {
		return embalagemIntegra;
	}

	public void setEmbalagemIntegra(Boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}

	public Boolean getEmbalagemSuja() {
		return embalagemSuja;
	}

	public void setEmbalagemSuja(Boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}

	public Boolean getEmbalagemUmida() {
		return embalagemUmida;
	}

	public void setEmbalagemUmida(Boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}

	public Boolean getEmbalagemDeformada() {
		return embalagemDeformada;
	}

	public void setEmbalagemDeformada(Boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}

	public Boolean getEmbalagemVazada() {
		return embalagemVazada;
	}

	public void setEmbalagemVazada(Boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}

	public Boolean getEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}

	public void setEmbalagemLacreViolado(Boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}

	public Integer getNumeroConhecimento() {
		return numeroConhecimento;
	}

	public void setNumeroConhecimento(Integer numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Funcionario getConferente() {
		return conferente;
	}

	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
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
