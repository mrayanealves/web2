package br.imd.ufrn.models;

import java.util.Date;

import br.imd.ufrn.enums.StatusRequisicao;

/**
 * Classe com o histórico de uma requisição
 * @author mrayanealves
 *
 */
public class HistoricoRequisicao {
	private Date dataRegistro;
	private StatusRequisicao statusRequisicao;
	private Usuario usuario;
	private String observacoes;
	
	public HistoricoRequisicao() {
	}

	public HistoricoRequisicao(Date dataRegistro, StatusRequisicao statusRequisicao, Usuario usuario) {
		this.dataRegistro = dataRegistro;
		this.statusRequisicao = statusRequisicao;
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataRegistro == null) ? 0 : dataRegistro.hashCode());
		result = prime * result + ((statusRequisicao == null) ? 0 : statusRequisicao.hashCode());
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
		HistoricoRequisicao other = (HistoricoRequisicao) obj;
		if (dataRegistro == null) {
			if (other.dataRegistro != null)
				return false;
		} else if (!dataRegistro.equals(other.dataRegistro))
			return false;
		if (statusRequisicao != other.statusRequisicao)
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public StatusRequisicao getStatusRequisicao() {
		return statusRequisicao;
	}

	public void setStatusRequisicao(StatusRequisicao statusRequisicao) {
		this.statusRequisicao = statusRequisicao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
