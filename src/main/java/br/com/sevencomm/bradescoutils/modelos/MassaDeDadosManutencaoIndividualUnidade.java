package br.com.sevencomm.bradescoutils.modelos;

import br.com.sevencomm.bradescoutils.enums.TipoHierarquiaUnidade;

public class MassaDeDadosManutencaoIndividualUnidade extends MassaDeDados {
	private TipoHierarquiaUnidade tipoHierarquia;
	private String tipoUnidade;
	private String cnpjSequenciaEmpresaSubordinada;
	private String codigoSequenciaEmpresaSubordinada;
	private String cnpjSequenciaEmpresaSuperior;
	private String codigoSequenciaEmpresaSuperior;

	public MassaDeDadosManutencaoIndividualUnidade(TipoHierarquiaUnidade tipoHierarquia, String tipoUnidade,
			String cnpjSequenciaEmpresaSubordinada, String codigoSequenciaEmpresaSubordinada,
			String cnpjSequenciaEmpresaSuperior, String codigoSequenciaEmpresaSuperior) {
		this.tipoHierarquia = tipoHierarquia;
		this.tipoUnidade = tipoUnidade;
		this.cnpjSequenciaEmpresaSubordinada = cnpjSequenciaEmpresaSubordinada;
		this.codigoSequenciaEmpresaSubordinada = codigoSequenciaEmpresaSubordinada;
		this.cnpjSequenciaEmpresaSuperior = cnpjSequenciaEmpresaSuperior;
		this.codigoSequenciaEmpresaSuperior = codigoSequenciaEmpresaSuperior;
	}

	public TipoHierarquiaUnidade getTipoHierarquia() {
		return tipoHierarquia;
	}

	public void setTipoHierarquia(TipoHierarquiaUnidade tipoHierarquia) {
		this.tipoHierarquia = tipoHierarquia;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getCnpjSequenciaEmpresaSubordinada() {
		return cnpjSequenciaEmpresaSubordinada;
	}

	public void setCnpjSequenciaEmpresaSubordinada(String cnpjSequenciaEmpresaSubordinada) {
		this.cnpjSequenciaEmpresaSubordinada = cnpjSequenciaEmpresaSubordinada;
	}

	public String getCodigoSequenciaEmpresaSubordinada() {
		return codigoSequenciaEmpresaSubordinada;
	}

	public void setCodigoSequenciaEmpresaSubordinada(String codigoSequenciaEmpresaSubordinada) {
		this.codigoSequenciaEmpresaSubordinada = codigoSequenciaEmpresaSubordinada;
	}

	public String getCnpjSequenciaEmpresaSuperior() {
		return cnpjSequenciaEmpresaSuperior;
	}

	public void setCnpjSequenciaEmpresaSuperior(String cnpjSequenciaEmpresaSuperior) {
		this.cnpjSequenciaEmpresaSuperior = cnpjSequenciaEmpresaSuperior;
	}

	public String getCodigoSequenciaEmpresaSuperior() {
		return codigoSequenciaEmpresaSuperior;
	}

	public void setCodigoSequenciaEmpresaSuperior(String codigoSequenciaEmpresaSuperior) {
		this.codigoSequenciaEmpresaSuperior = codigoSequenciaEmpresaSuperior;
	}

}