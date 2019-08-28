package br.imd.ufrn.models;

import java.math.BigDecimal;

/**
 * Classe com a dimensão de uma unidade
 * @author mrayanealves
 *
 */
public class DimensaoUnidade {
	private BigDecimal altura;
	private BigDecimal largura;
	private BigDecimal profundidade;
	
	public DimensaoUnidade() {
	}

	public DimensaoUnidade(BigDecimal altura, BigDecimal largura, BigDecimal profundidade) {
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((altura == null) ? 0 : altura.hashCode());
		result = prime * result + ((largura == null) ? 0 : largura.hashCode());
		result = prime * result + ((profundidade == null) ? 0 : profundidade.hashCode());
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
		DimensaoUnidade other = (DimensaoUnidade) obj;
		if (altura == null) {
			if (other.altura != null)
				return false;
		} else if (!altura.equals(other.altura))
			return false;
		if (largura == null) {
			if (other.largura != null)
				return false;
		} else if (!largura.equals(other.largura))
			return false;
		if (profundidade == null) {
			if (other.profundidade != null)
				return false;
		} else if (!profundidade.equals(other.profundidade))
			return false;
		return true;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public BigDecimal getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(BigDecimal profundidade) {
		this.profundidade = profundidade;
	}
}
