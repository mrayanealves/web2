package br.imd.ufrn.models;

import java.math.BigDecimal;

import br.imd.ufrn.doc.Documento;
import br.imd.ufrn.producao.DenominacaoComumBrasileira;

/**
 * Classe com as informações de um matérial analizável
 * @author mrayanealves
 *
 */
public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private Integer prazoEntraga;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Documento fichaSeguranca;
	private Long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private Integer tempoLimiteAnalise;
	private Integer testeMaquina;
	private Material material;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apresentacaoFarmaceutica == null) ? 0 : apresentacaoFarmaceutica.hashCode());
		result = prime * result + ((dcb == null) ? 0 : dcb.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((registroAnvisa == null) ? 0 : registroAnvisa.hashCode());
		result = prime * result + ((teorConcentracao == null) ? 0 : teorConcentracao.hashCode());
		result = prime * result + ((testeMaquina == null) ? 0 : testeMaquina.hashCode());
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
		MaterialAnalisavel other = (MaterialAnalisavel) obj;
		if (apresentacaoFarmaceutica == null) {
			if (other.apresentacaoFarmaceutica != null)
				return false;
		} else if (!apresentacaoFarmaceutica.equals(other.apresentacaoFarmaceutica))
			return false;
		if (dcb == null) {
			if (other.dcb != null)
				return false;
		} else if (!dcb.equals(other.dcb))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (registroAnvisa == null) {
			if (other.registroAnvisa != null)
				return false;
		} else if (!registroAnvisa.equals(other.registroAnvisa))
			return false;
		if (teorConcentracao == null) {
			if (other.teorConcentracao != null)
				return false;
		} else if (!teorConcentracao.equals(other.teorConcentracao))
			return false;
		if (testeMaquina == null) {
			if (other.testeMaquina != null)
				return false;
		} else if (!testeMaquina.equals(other.testeMaquina))
			return false;
		return true;
	}

	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}

	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}

	public Integer getPrazoEntraga() {
		return prazoEntraga;
	}

	public void setPrazoEntraga(Integer prazoEntraga) {
		this.prazoEntraga = prazoEntraga;
	}

	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}

	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}

	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}

	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}

	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}

	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}

	public Documento getFichaSeguranca() {
		return fichaSeguranca;
	}

	public void setFichaSeguranca(Documento fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}

	public Long getRegistroAnvisa() {
		return registroAnvisa;
	}

	public void setRegistroAnvisa(Long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}

	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}

	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}

	public Integer getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}

	public void setTempoLimiteAnalise(Integer tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}

	public Integer getTesteMaquina() {
		return testeMaquina;
	}

	public void setTesteMaquina(Integer testeMaquina) {
		this.testeMaquina = testeMaquina;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
