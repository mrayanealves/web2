package br.imd.ufrn.models;

import java.math.BigDecimal;

/**
 * Classe com os dados do volume de um material
 * @author mrayanealves
 *
 */
public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicial;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	private LocalizacaoAlmoxarifado localizacao;
	private LoteMaterial lote;
	private VolumeMaterial volumeOrigem;
	
	public VolumeMaterial() {

	}

	public VolumeMaterial(String codigo, Material material, BigDecimal qtdAtual, LoteMaterial lote,
			VolumeMaterial volumeOrigem) {
		this.codigo = codigo;
		this.material = material;
		this.qtdAtual = qtdAtual;
		this.lote = lote;
		this.volumeOrigem = volumeOrigem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((lote == null) ? 0 : lote.hashCode());
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
		VolumeMaterial other = (VolumeMaterial) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (lote == null) {
			if (other.lote != null)
				return false;
		} else if (!lote.equals(other.lote))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdInicial() {
		return qtdInicial;
	}

	public void setQtdInicial(BigDecimal qtdInicial) {
		this.qtdInicial = qtdInicial;
	}

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public DimensaoUnidade getDimensao() {
		return dimensao;
	}

	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}

	public LocalizacaoAlmoxarifado getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoAlmoxarifado localizacao) {
		this.localizacao = localizacao;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}

	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}
}
