package br.imd.ufrn.models;

import java.util.Date;
import java.util.List;

import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.enums.StatusMovimentacao;
import br.imd.ufrn.rh.PessoaJuridica;

/**
 * Classe com os dados de saída do estoque
 * @author mrayanealves
 *
 */
public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoEstoque> movimentacaoSaida;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Documento> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestinatario;
	private String justificativa;
	
	public SaidaEstoque() {
	}

	public SaidaEstoque(Usuario responsavel, Date dataEnvio, List<MovimentacaoEstoque> movimentacaoSaida,
			StatusMovimentacao status, PessoaJuridica transportadora, GuiaRemessa guiaRemessa,
			PessoaJuridica pjDestinatario, String justificativa) {
		this.responsavel = responsavel;
		this.dataEnvio = dataEnvio;
		this.movimentacaoSaida = movimentacaoSaida;
		this.status = status;
		this.transportadora = transportadora;
		this.guiaRemessa = guiaRemessa;
		this.pjDestinatario = pjDestinatario;
		this.justificativa = justificativa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
		result = prime * result + ((guiaRemessa == null) ? 0 : guiaRemessa.hashCode());
		result = prime * result + ((justificativa == null) ? 0 : justificativa.hashCode());
		result = prime * result + ((movimentacaoSaida == null) ? 0 : movimentacaoSaida.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + ((pjDestinatario == null) ? 0 : pjDestinatario.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((transportadora == null) ? 0 : transportadora.hashCode());
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
		SaidaEstoque other = (SaidaEstoque) obj;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dataEnvio == null) {
			if (other.dataEnvio != null)
				return false;
		} else if (!dataEnvio.equals(other.dataEnvio))
			return false;
		if (guiaRemessa == null) {
			if (other.guiaRemessa != null)
				return false;
		} else if (!guiaRemessa.equals(other.guiaRemessa))
			return false;
		if (justificativa == null) {
			if (other.justificativa != null)
				return false;
		} else if (!justificativa.equals(other.justificativa))
			return false;
		if (movimentacaoSaida == null) {
			if (other.movimentacaoSaida != null)
				return false;
		} else if (!movimentacaoSaida.equals(other.movimentacaoSaida))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (pjDestinatario == null) {
			if (other.pjDestinatario != null)
				return false;
		} else if (!pjDestinatario.equals(other.pjDestinatario))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (status != other.status)
			return false;
		if (transportadora == null) {
			if (other.transportadora != null)
				return false;
		} else if (!transportadora.equals(other.transportadora))
			return false;
		return true;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public List<MovimentacaoEstoque> getMovimentacaoSaida() {
		return movimentacaoSaida;
	}

	public void setMovimentacaoSaida(List<MovimentacaoEstoque> movimentacaoSaida) {
		this.movimentacaoSaida = movimentacaoSaida;
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

	public PessoaJuridica getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}

	public List<Documento> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Documento> anexos) {
		this.anexos = anexos;
	}

	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}

	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}

	public PessoaJuridica getPjDestinatario() {
		return pjDestinatario;
	}

	public void setPjDestinatario(PessoaJuridica pjDestinatario) {
		this.pjDestinatario = pjDestinatario;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
}
