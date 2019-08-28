package br.imd.ufrn.models;

/**
 * Classe com as informaçĩes de localização de um almoxarifado
 * @author mrayanealves
 *
 */
public class LocalizacaoAlmoxarifado {
	private String localizacoes;

	public LocalizacaoAlmoxarifado() {
	}

	public LocalizacaoAlmoxarifado(String localizacoes) {
		this.localizacoes = localizacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localizacoes == null) ? 0 : localizacoes.hashCode());
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
		LocalizacaoAlmoxarifado other = (LocalizacaoAlmoxarifado) obj;
		if (localizacoes == null) {
			if (other.localizacoes != null)
				return false;
		} else if (!localizacoes.equals(other.localizacoes))
			return false;
		return true;
	}

	public String getLocalizacoes() {
		return localizacoes;
	}

	public void setLocalizacoes(String localizacoes) {
		this.localizacoes = localizacoes;
	}
}
