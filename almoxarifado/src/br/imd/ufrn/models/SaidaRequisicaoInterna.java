package br.imd.ufrn.models;

import java.util.List;

import br.imd.ufrn.enums.StatusRequisicao;
import br.imd.ufrn.rh.Setor;

/**
 * Classe com os dados da requisição de saída interna
 * @author mrayanealves
 *
 */
public class SaidaRequisicaoInterna {
	private String codigo;
	private Usuario requisitante;
	private Setor setorRequisitante;
	private Usuario responsavelSetor;
	private StatusRequisicao statusRequisicao;
	private List<ItemRequisicao> itenRequisicaos;
	private List<HistoricoRequisicao> historicoRequisicaos;
	private SaidaEstoque saidaEstoque;
	
	public SaidaRequisicaoInterna() {
	}

	public SaidaRequisicaoInterna(String codigo, Usuario requisitante, Setor setorRequisitante,
			Usuario responsavelSetor, StatusRequisicao statusRequisicao, List<ItemRequisicao> itenRequisicaos,
			List<HistoricoRequisicao> historicoRequisicaos, SaidaEstoque saidaEstoque) {
		this.codigo = codigo;
		this.requisitante = requisitante;
		this.setorRequisitante = setorRequisitante;
		this.responsavelSetor = responsavelSetor;
		this.statusRequisicao = statusRequisicao;
		this.itenRequisicaos = itenRequisicaos;
		this.historicoRequisicaos = historicoRequisicaos;
		this.saidaEstoque = saidaEstoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((historicoRequisicaos == null) ? 0 : historicoRequisicaos.hashCode());
		result = prime * result + ((itenRequisicaos == null) ? 0 : itenRequisicaos.hashCode());
		result = prime * result + ((requisitante == null) ? 0 : requisitante.hashCode());
		result = prime * result + ((responsavelSetor == null) ? 0 : responsavelSetor.hashCode());
		result = prime * result + ((saidaEstoque == null) ? 0 : saidaEstoque.hashCode());
		result = prime * result + ((setorRequisitante == null) ? 0 : setorRequisitante.hashCode());
		result = prime * result + ((statusRequisicao == null) ? 0 : statusRequisicao.hashCode());
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
		SaidaRequisicaoInterna other = (SaidaRequisicaoInterna) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (historicoRequisicaos == null) {
			if (other.historicoRequisicaos != null)
				return false;
		} else if (!historicoRequisicaos.equals(other.historicoRequisicaos))
			return false;
		if (itenRequisicaos == null) {
			if (other.itenRequisicaos != null)
				return false;
		} else if (!itenRequisicaos.equals(other.itenRequisicaos))
			return false;
		if (requisitante == null) {
			if (other.requisitante != null)
				return false;
		} else if (!requisitante.equals(other.requisitante))
			return false;
		if (responsavelSetor == null) {
			if (other.responsavelSetor != null)
				return false;
		} else if (!responsavelSetor.equals(other.responsavelSetor))
			return false;
		if (saidaEstoque == null) {
			if (other.saidaEstoque != null)
				return false;
		} else if (!saidaEstoque.equals(other.saidaEstoque))
			return false;
		if (setorRequisitante == null) {
			if (other.setorRequisitante != null)
				return false;
		} else if (!setorRequisitante.equals(other.setorRequisitante))
			return false;
		if (statusRequisicao != other.statusRequisicao)
			return false;
		return true;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Usuario getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(Usuario requisitante) {
		this.requisitante = requisitante;
	}

	public Setor getSetorRequisitante() {
		return setorRequisitante;
	}

	public void setSetorRequisitante(Setor setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}

	public Usuario getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(Usuario responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public List<ItemRequisicao> getItenRequisicaos() {
		return itenRequisicaos;
	}

	public void setItenRequisicaos(List<ItemRequisicao> itenRequisicaos) {
		this.itenRequisicaos = itenRequisicaos;
	}

	public List<HistoricoRequisicao> getHistoricoRequisicaos() {
		return historicoRequisicaos;
	}

	public void setHistoricoRequisicaos(List<HistoricoRequisicao> historicoRequisicaos) {
		this.historicoRequisicaos = historicoRequisicaos;
	}

	public SaidaEstoque getSaidaEstoque() {
		return saidaEstoque;
	}

	public void setSaidaEstoque(SaidaEstoque saidaEstoque) {
		this.saidaEstoque = saidaEstoque;
	}
}
