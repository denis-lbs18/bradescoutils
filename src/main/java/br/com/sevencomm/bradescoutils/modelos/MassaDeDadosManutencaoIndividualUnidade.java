package br.com.sevencomm.bradescoutils.modelos;

import java.time.LocalDateTime;

import br.com.sevencomm.bradescoutils.enums.TipoHierarquiaUnidade;

public class MassaDeDadosManutencaoIndividualUnidade extends MassaDeDados {
	private TipoHierarquiaUnidade tipoHierarquia;
	private LocalDateTime dataInicioVigencia;
	private LocalDateTime dataFimVigencia;
	private String cnpjEmpresaSubordinada;
	private String tipoUnidadeSubordinada;
	private String tipoCodigoSubordinada;
	private String codigoSubordinada;
	private String cnpjEmpresaSuperior;
	private String tipoUnidadeSuperior;
	private String tipoCodigoSuperior;
	private String codigoSuperior;

	public MassaDeDadosManutencaoIndividualUnidade(TipoHierarquiaUnidade tipoHierarquia, String cnpjEmpresaSubordinada,
			String tipoUnidadeSubordinada, String tipoCodigoSubordinada, String codigoSubordinada,
			String cnpjEmpresaSuperior, String tipoUnidadeSuperior, String tipoCodigoSuperior, String codigoSuperior) {
		this.tipoHierarquia = tipoHierarquia;
		this.cnpjEmpresaSubordinada = cnpjEmpresaSubordinada;
		this.tipoUnidadeSubordinada = tipoUnidadeSubordinada;
		this.tipoCodigoSubordinada = tipoCodigoSubordinada;
		this.codigoSubordinada = codigoSubordinada;
		this.cnpjEmpresaSuperior = cnpjEmpresaSuperior;
		this.tipoUnidadeSuperior = tipoUnidadeSuperior;
		this.tipoCodigoSuperior = tipoCodigoSuperior;
		this.codigoSuperior = codigoSuperior;
	}

	public MassaDeDadosManutencaoIndividualUnidade(TipoHierarquiaUnidade tipoHierarquia, String cnpjEmpresaSubordinada,
			String tipoUnidadeSubordinada, String tipoCodigoSubordinada, String codigoSubordinada) {
		this.tipoHierarquia = tipoHierarquia;
		this.cnpjEmpresaSubordinada = cnpjEmpresaSubordinada;
		this.tipoUnidadeSubordinada = tipoUnidadeSubordinada;
		this.tipoCodigoSubordinada = tipoCodigoSubordinada;
		this.codigoSubordinada = codigoSubordinada;
	}

	public TipoHierarquiaUnidade getTipoHierarquia() {
		return tipoHierarquia;
	}

	public void setTipoHierarquia(TipoHierarquiaUnidade tipoHierarquia) {
		this.tipoHierarquia = tipoHierarquia;
	}

	public LocalDateTime getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(LocalDateTime dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public LocalDateTime getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(LocalDateTime dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public String getCnpjEmpresaSubordinada() {
		return cnpjEmpresaSubordinada;
	}

	public void setCnpjEmpresaSubordinada(String cnpjEmpresaSubordinada) {
		this.cnpjEmpresaSubordinada = cnpjEmpresaSubordinada;
	}

	public String getTipoUnidadeSubordinada() {
		return tipoUnidadeSubordinada;
	}

	public void setTipoUnidadeSubordinada(String tipoUnidadeSubordinada) {
		this.tipoUnidadeSubordinada = tipoUnidadeSubordinada;
	}

	public String getTipoCodigoSubordinada() {
		return tipoCodigoSubordinada;
	}

	public void setTipoCodigoSubordinada(String tipoCodigoSubordinada) {
		this.tipoCodigoSubordinada = tipoCodigoSubordinada;
	}

	public String getCodigoSubordinada() {
		return codigoSubordinada;
	}

	public void setCodigoSubordinada(String codigoSubordinada) {
		this.codigoSubordinada = codigoSubordinada;
	}

	public String getCnpjEmpresaSuperior() {
		return cnpjEmpresaSuperior;
	}

	public void setCnpjEmpresaSuperior(String cnpjEmpresaSuperior) {
		this.cnpjEmpresaSuperior = cnpjEmpresaSuperior;
	}

	public String getTipoUnidadeSuperior() {
		return tipoUnidadeSuperior;
	}

	public void setTipoUnidadeSuperior(String tipoUnidadeSuperior) {
		this.tipoUnidadeSuperior = tipoUnidadeSuperior;
	}

	public String getTipoCodigoSuperior() {
		return tipoCodigoSuperior;
	}

	public void setTipoCodigoSuperior(String tipoCodigoSuperior) {
		this.tipoCodigoSuperior = tipoCodigoSuperior;
	}

	public String getCodigoSuperior() {
		return codigoSuperior;
	}

	public void setCodigoSuperior(String codigoSuperior) {
		this.codigoSuperior = codigoSuperior;
	}

}