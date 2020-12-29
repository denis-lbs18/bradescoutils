package br.com.sevencomm.bradescoutils.modelos;

import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;

public class MassaDeDadosManutencaoIndividualEmpresa extends MassaDeDados {
	private TipoHierarquia tipoHierarquia;
	private String cnpjSequenciaEmpresaSubordinada;
	private String codigoSequenciaEmpresaSubordinada;
	private String cnpjSequenciaEmpresaSuperior;
	private String codigoSequenciaEmpresaSuperior;

	public MassaDeDadosManutencaoIndividualEmpresa(TipoHierarquia tipoHierarquia, String cnpjSequenciaEmpresaSubordinada,
			String codigoSequenciaEmpresaSubordinada, String cnpjSequenciaEmpresaSuperior,
			String codigoSequenciaEmpresaSuperior) {
		this.tipoHierarquia = tipoHierarquia;
		this.cnpjSequenciaEmpresaSubordinada = cnpjSequenciaEmpresaSubordinada;
		this.codigoSequenciaEmpresaSubordinada = codigoSequenciaEmpresaSubordinada;
		this.cnpjSequenciaEmpresaSuperior = cnpjSequenciaEmpresaSuperior;
		this.codigoSequenciaEmpresaSuperior = codigoSequenciaEmpresaSuperior;
	}

	public TipoHierarquia getTipoHierarquia() {
		return tipoHierarquia;
	}

	public void setTipoHierarquia(TipoHierarquia tipoHierarquia) {
		this.tipoHierarquia = tipoHierarquia;
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