package br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.constants.TempoTimeouts;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaManutencaoIndividualDeHierarquiaDeEmpresa extends TelaBase {
	private By selectTipoHierarquia = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.selectHierarquia"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.botaoCNPJEmpresaSubordinada"));

	private By inputCodigoSequenciaEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.inputCodigoSequenciaEmpresaSubordinada"));
	private By botaoCodigoSequenciaEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.botaoCodigoSequenciaEmpresaSubordinada"));

	private By imgCalendarDataInicioVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 1);
	private By imgCalendarDataFimVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 2);

	private By botaoIncluir = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.botaoIncluir"));
	private By botaoConsultar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.botaoConsultar"));

	public TelaManutencaoIndividualDeHierarquiaDeEmpresa(WebDriver driver) {
		super(driver);
	}

	public void selecionaTipoHierarquia(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoHierarquia, value);
	}

	public void selecionaTipoHierarquia(TipoHierarquia tipo) {
		this.selecionaTipoHierarquia(tipo.toString());
	}

	public void selecionaTipoHierarquia(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoHierarquia, index);
	}

	public void insereTextoInputCNPJEmpresaSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSubordinada, value);
	}

	public void clicaBotaoCNPJEmpresaSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSubordinada);
	}

	public void insereTextoInputCodigoSequenciaEmpresaSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSequenciaEmpresaSubordinada, value);
	}

	public void clicaBotaoCodigoSequenciaEmpresaSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSequenciaEmpresaSubordinada);
	}

	public void selecionaDiaDataInicioVigencia(String dia) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.imgCalendarDataInicioVigencia);

		By tdDia = ByUtils.encontraByTexto(ByUtils.TD, dia);
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(tdDia);
	}

	public void selecionaDiaDataFimVigencia(String dia) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.imgCalendarDataFimVigencia);

		By tdDia = ByUtils.encontraByTexto(ByUtils.TD, dia, 2);
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(tdDia);
	}

	public void preencheDadosConsulta(String textoCodigoEmpresaSubordinada, TipoHierarquia tipoHierarquia,
			String diaInicio, String diaFim) {
		this.insereTextoInputCodigoSequenciaEmpresaSubordinada(textoCodigoEmpresaSubordinada);
		this.clicaBotaoCodigoSequenciaEmpresaSubordinada();
		this.selecionaTipoHierarquia(tipoHierarquia);

		this.selecionaDiaDataInicioVigencia(diaInicio);
		this.selecionaDiaDataFimVigencia(diaFim);
	}

	public void preencheDadosConsulta(TipoHierarquia tipoHierarquia, String diaInicio, String diaFim) {
		this.selecionaTipoHierarquia(tipoHierarquia);

		this.selecionaDiaDataInicioVigencia(diaInicio);
		this.selecionaDiaDataFimVigencia(diaFim);
	}

	public TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa clicaBotaoIncluir() {
		this.getElemento().elementoWebClica(this.botaoIncluir);

		return new TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}

	public TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa clicaBotaoConsultar() {
		this.getElemento().elementoWebClica(this.botaoConsultar);

		return new TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}
}