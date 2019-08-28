package br.imd.ufrn.models;

import java.math.BigDecimal;
import java.util.Date;

import br.imd.ufrn.enums.EstadoLote;
import br.imd.ufrn.producao.OrigemProducao;
import br.imd.ufrn.rh.PessoaJuridica;

/**
 * Classe com as informações de lote de um material
 * @author mrayanealves
 *
 */
public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private Integer volumes;
	private OrigemProducao origemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private Integer qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private Double valorUnitario;
	
	public LoteMaterial() {
	}

	public LoteMaterial(Material material, Date dataValidade, Date dataFabricacao, String numeroLoteFabricante,
			Integer volumes, PessoaJuridica fabricante, PessoaJuridica fornecedor) {
		this.material = material;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.numeroLoteFabricante = numeroLoteFabricante;
		this.volumes = volumes;
		this.fabricante = fabricante;
		this.fornecedor = fornecedor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFabricacao == null) ? 0 : dataFabricacao.hashCode());
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((numeroLoteFabricante == null) ? 0 : numeroLoteFabricante.hashCode());
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
		LoteMaterial other = (LoteMaterial) obj;
		if (dataFabricacao == null) {
			if (other.dataFabricacao != null)
				return false;
		} else if (!dataFabricacao.equals(other.dataFabricacao))
			return false;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (numeroLoteFabricante == null) {
			if (other.numeroLoteFabricante != null)
				return false;
		} else if (!numeroLoteFabricante.equals(other.numeroLoteFabricante))
			return false;
		return true;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public EstadoLote getEstado() {
		return estado;
	}

	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}

	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}

	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}

	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}

	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}

	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}

	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}

	public Integer getVolumes() {
		return volumes;
	}

	public void setVolumes(Integer volumes) {
		this.volumes = volumes;
	}

	public OrigemProducao getOrigemProducao() {
		return origemProducao;
	}

	public void setOrigemProducao(OrigemProducao origemProducao) {
		this.origemProducao = origemProducao;
	}

	public PessoaJuridica getFabricante() {
		return fabricante;
	}

	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}

	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Integer getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}

	public void setQtdCaixaEmbarque(Integer qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}

	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}

	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}

	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}

	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}

	public BigDecimal getTara() {
		return tara;
	}

	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
