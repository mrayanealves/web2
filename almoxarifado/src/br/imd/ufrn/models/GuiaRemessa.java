package br.imd.ufrn.models;

import java.util.Date;

import br.imd.ufrn.enums.ViaTransporte;

/**
 * Classe com a guia de uma remessa
 * @author mrayanealves
 *
 */
public class GuiaRemessa {
	private Integer numeroGuiaRemessa;
	private Date dataEmissao;
	private ViaTransporte viaTransporte;
	private String especieEmbalagem;
	private NaturezaOperacao naturezaOperacao;
	private Integer remessa;
	
	public GuiaRemessa() {
	}

	public GuiaRemessa(Integer numeroGuiaRemessa, Date dataEmissao, ViaTransporte viaTransporte,
			String especieEmbalagem, NaturezaOperacao naturezaOperacao, Integer remessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
		this.dataEmissao = dataEmissao;
		this.viaTransporte = viaTransporte;
		this.especieEmbalagem = especieEmbalagem;
		this.naturezaOperacao = naturezaOperacao;
		this.remessa = remessa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((especieEmbalagem == null) ? 0 : especieEmbalagem.hashCode());
		result = prime * result + ((naturezaOperacao == null) ? 0 : naturezaOperacao.hashCode());
		result = prime * result + ((numeroGuiaRemessa == null) ? 0 : numeroGuiaRemessa.hashCode());
		result = prime * result + ((remessa == null) ? 0 : remessa.hashCode());
		result = prime * result + ((viaTransporte == null) ? 0 : viaTransporte.hashCode());
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
		GuiaRemessa other = (GuiaRemessa) obj;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (especieEmbalagem == null) {
			if (other.especieEmbalagem != null)
				return false;
		} else if (!especieEmbalagem.equals(other.especieEmbalagem))
			return false;
		if (naturezaOperacao == null) {
			if (other.naturezaOperacao != null)
				return false;
		} else if (!naturezaOperacao.equals(other.naturezaOperacao))
			return false;
		if (numeroGuiaRemessa == null) {
			if (other.numeroGuiaRemessa != null)
				return false;
		} else if (!numeroGuiaRemessa.equals(other.numeroGuiaRemessa))
			return false;
		if (remessa == null) {
			if (other.remessa != null)
				return false;
		} else if (!remessa.equals(other.remessa))
			return false;
		if (viaTransporte != other.viaTransporte)
			return false;
		return true;
	}

	public Integer getNumeroGuiaRemessa() {
		return numeroGuiaRemessa;
	}

	public void setNumeroGuiaRemessa(Integer numeroGuiaRemessa) {
		this.numeroGuiaRemessa = numeroGuiaRemessa;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public ViaTransporte getViaTransporte() {
		return viaTransporte;
	}

	public void setViaTransporte(ViaTransporte viaTransporte) {
		this.viaTransporte = viaTransporte;
	}

	public String getEspecieEmbalagem() {
		return especieEmbalagem;
	}

	public void setEspecieEmbalagem(String especieEmbalagem) {
		this.especieEmbalagem = especieEmbalagem;
	}

	public NaturezaOperacao getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public Integer getRemessa() {
		return remessa;
	}

	public void setRemessa(Integer remessa) {
		this.remessa = remessa;
	}
}
