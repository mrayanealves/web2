package br.imd.ufrn.models;

/**
 * Classe com os dados do pagamento
 * @author mrayanealves
 *
 */
public class DadosPagamento {
	private String banco;
	private String agencia;
	private String conta;
	private String codigoIdentificacaoDV;
	
	public DadosPagamento() {
	}

	public DadosPagamento(String banco, String agencia, String conta) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
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
		DadosPagamento other = (DadosPagamento) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		return true;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCodigoIdentificacaoDV() {
		return codigoIdentificacaoDV;
	}

	public void setCodigoIdentificacaoDV(String codigoIdentificacaoDV) {
		this.codigoIdentificacaoDV = codigoIdentificacaoDV;
	}
}
