package br.imd.ufrn.models;

import java.math.BigDecimal;

import br.imd.ufrn.enums.StatusMaterial;

/**
 * Classe que representa um material
 * @author mrayanealves
 *
 */
public class Material {
	private Integer codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private Integer estoqueMinimo;
	private Integer pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private UnidadeMedida unidadeSaida;
	private BigDecimal fatorConversaoSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private Integer catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	
	public Material() {
	}

	public Material(Integer codigo, String nome, String especificacao, ClassificacaoMaterial classificacao,
			StatusMaterial status) {
		this.codigo = codigo;
		this.nome = nome;
		this.especificacao = especificacao;
		this.classificacao = classificacao;
		this.status = status;
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
		Material other = (Material) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}

	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}

	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Integer getPontoPedido() {
		return pontoPedido;
	}

	public void setPontoPedido(Integer pontoPedido) {
		this.pontoPedido = pontoPedido;
	}

	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}

	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}

	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}

	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}

	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}

	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}

	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}

	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}

	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}

	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}

	public String getDadosAdicionais() {
		return dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}

	public Integer getCatmat() {
		return catmat;
	}

	public void setCatmat(Integer catmat) {
		this.catmat = catmat;
	}

	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}

	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}

	public StatusMaterial getStatus() {
		return status;
	}

	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
}
