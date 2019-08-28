package br.imd.ufrn.models;

import java.math.BigDecimal;
import java.util.Date;

import br.imd.ufrn.enums.TipoMovimentacao;
import br.imd.ufrn.rh.PessoaJuridica;

/**
 * Classe com os dados de movimentação do estoque
 * @author mrayanealves
 *
 */
public class MovimentacaoEstoque {
	private Usuario usuario;
	private PessoaJuridica pjOrigem;
	private Almoxarifado almoxarifadoOrigem;
	private PessoaJuridica pjDestino;
	private Almoxarifado almoxarifadoDestino;
	private BigDecimal qtdMovimentada;
	private LoteMaterial itemLote;
	private LoteMaterial itemMaterial;
	private Date dataMovimentacao;
	private TipoMovimentacao tipoMovimentacao;
	
	public MovimentacaoEstoque() {
	}

	public MovimentacaoEstoque(Usuario usuario, Almoxarifado almoxarifadoOrigem, Almoxarifado almoxarifadoDestino,
			BigDecimal qtdMovimentada, LoteMaterial itemLote, LoteMaterial itemMaterial, Date dataMovimentacao,
			TipoMovimentacao tipoMovimentacao) {
		this.usuario = usuario;
		this.almoxarifadoOrigem = almoxarifadoOrigem;
		this.almoxarifadoDestino = almoxarifadoDestino;
		this.qtdMovimentada = qtdMovimentada;
		this.itemLote = itemLote;
		this.itemMaterial = itemMaterial;
		this.dataMovimentacao = dataMovimentacao;
		this.tipoMovimentacao = tipoMovimentacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((almoxarifadoDestino == null) ? 0 : almoxarifadoDestino.hashCode());
		result = prime * result + ((almoxarifadoOrigem == null) ? 0 : almoxarifadoOrigem.hashCode());
		result = prime * result + ((dataMovimentacao == null) ? 0 : dataMovimentacao.hashCode());
		result = prime * result + ((itemLote == null) ? 0 : itemLote.hashCode());
		result = prime * result + ((itemMaterial == null) ? 0 : itemMaterial.hashCode());
		result = prime * result + ((pjDestino == null) ? 0 : pjDestino.hashCode());
		result = prime * result + ((pjOrigem == null) ? 0 : pjOrigem.hashCode());
		result = prime * result + ((qtdMovimentada == null) ? 0 : qtdMovimentada.hashCode());
		result = prime * result + ((tipoMovimentacao == null) ? 0 : tipoMovimentacao.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		MovimentacaoEstoque other = (MovimentacaoEstoque) obj;
		if (almoxarifadoDestino == null) {
			if (other.almoxarifadoDestino != null)
				return false;
		} else if (!almoxarifadoDestino.equals(other.almoxarifadoDestino))
			return false;
		if (almoxarifadoOrigem == null) {
			if (other.almoxarifadoOrigem != null)
				return false;
		} else if (!almoxarifadoOrigem.equals(other.almoxarifadoOrigem))
			return false;
		if (dataMovimentacao == null) {
			if (other.dataMovimentacao != null)
				return false;
		} else if (!dataMovimentacao.equals(other.dataMovimentacao))
			return false;
		if (itemLote == null) {
			if (other.itemLote != null)
				return false;
		} else if (!itemLote.equals(other.itemLote))
			return false;
		if (itemMaterial == null) {
			if (other.itemMaterial != null)
				return false;
		} else if (!itemMaterial.equals(other.itemMaterial))
			return false;
		if (pjDestino == null) {
			if (other.pjDestino != null)
				return false;
		} else if (!pjDestino.equals(other.pjDestino))
			return false;
		if (pjOrigem == null) {
			if (other.pjOrigem != null)
				return false;
		} else if (!pjOrigem.equals(other.pjOrigem))
			return false;
		if (qtdMovimentada == null) {
			if (other.qtdMovimentada != null)
				return false;
		} else if (!qtdMovimentada.equals(other.qtdMovimentada))
			return false;
		if (tipoMovimentacao != other.tipoMovimentacao)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public PessoaJuridica getPjOrigem() {
		return pjOrigem;
	}

	public void setPjOrigem(PessoaJuridica pjOrigem) {
		this.pjOrigem = pjOrigem;
	}

	public Almoxarifado getAlmoxarifadoOrigem() {
		return almoxarifadoOrigem;
	}

	public void setAlmoxarifadoOrigem(Almoxarifado almoxarifadoOrigem) {
		this.almoxarifadoOrigem = almoxarifadoOrigem;
	}

	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}

	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}

	public Almoxarifado getAlmoxarifadoDestino() {
		return almoxarifadoDestino;
	}

	public void setAlmoxarifadoDestino(Almoxarifado almoxarifadoDestino) {
		this.almoxarifadoDestino = almoxarifadoDestino;
	}

	public BigDecimal getQtdMovimentada() {
		return qtdMovimentada;
	}

	public void setQtdMovimentada(BigDecimal qtdMovimentada) {
		this.qtdMovimentada = qtdMovimentada;
	}

	public LoteMaterial getItemLote() {
		return itemLote;
	}

	public void setItemLote(LoteMaterial itemLote) {
		this.itemLote = itemLote;
	}

	public LoteMaterial getItemMaterial() {
		return itemMaterial;
	}

	public void setItemMaterial(LoteMaterial itemMaterial) {
		this.itemMaterial = itemMaterial;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
}
