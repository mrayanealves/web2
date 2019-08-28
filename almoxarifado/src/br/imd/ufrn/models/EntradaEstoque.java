package br.imd.ufrn.models;

import java.util.Date;
import java.util.List;

import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.enums.StatusMovimentacao;
import br.imd.ufrn.enums.TipoEntrada;

/**
 * Classe com os dados da entrega de um estoque
 * @author mrayanealves
 *
 */
public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Documento> anexos;
	private Boolean precisaConferenciaEstado;
	private Boolean precisaPasagem;
	private Boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	
	public EntradaEstoque() {
	}

	public EntradaEstoque(String codigo, List<MovimentacaoEstoque> itens, StatusMovimentacao status,
			Usuario responsavel, Date dataEntrada, NotaFiscal notaFiscal, String justificativa,
			TipoEntrada tipoEntrada) {
		this.codigo = codigo;
		this.itens = itens;
		this.status = status;
		this.responsavel = responsavel;
		this.dataEntrada = dataEntrada;
		this.notaFiscal = notaFiscal;
		this.justificativa = justificativa;
		this.tipoEntrada = tipoEntrada;
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
		EntradaEstoque other = (EntradaEstoque) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<MovimentacaoEstoque> getItens() {
		return itens;
	}

	public void setItens(List<MovimentacaoEstoque> itens) {
		this.itens = itens;
	}

	public StatusMovimentacao getStatus() {
		return status;
	}

	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public Boolean getPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}

	public void setPrecisaConferenciaEstado(Boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}

	public Boolean getPrecisaPasagem() {
		return precisaPasagem;
	}

	public void setPrecisaPasagem(Boolean precisaPasagem) {
		this.precisaPasagem = precisaPasagem;
	}

	public Boolean getPrecisaAnalise() {
		return precisaAnalise;
	}

	public void setPrecisaAnalise(Boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}

	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public ChecklistRecebimentoComum getChecklistRecebimento() {
		return checklistRecebimento;
	}

	public void setChecklistRecebimento(ChecklistRecebimentoComum checklistRecebimento) {
		this.checklistRecebimento = checklistRecebimento;
	}

	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}

	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}

	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}

	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
}
