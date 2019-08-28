package br.imd.ufrn.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que atua como as informações de um estoque
 * @author mrayanealves
 *
 */
public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private List<MovimentacaoEstoque> historicoMovimentacoes;
	
	public Estoque() {
		this.historicoMovimentacoes = new ArrayList<MovimentacaoEstoque>();
	}

	public Estoque(Almoxarifado almoxarifado, LoteMaterial lote, Material material) {
		super();
		this.almoxarifado = almoxarifado;
		this.lote = lote;
		this.material = material;
		this.historicoMovimentacoes = new ArrayList<MovimentacaoEstoque>();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((almoxarifado == null) ? 0 : almoxarifado.hashCode());
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
		Estoque other = (Estoque) obj;
		if (almoxarifado == null) {
			if (other.almoxarifado != null)
				return false;
		} else if (!almoxarifado.equals(other.almoxarifado))
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

	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}

	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	public LoteMaterial getLote() {
		return lote;
	}

	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}

	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}

	public List<MovimentacaoEstoque> getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}

	public void setHistoricoMovimentacoes(List<MovimentacaoEstoque> historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}
}
