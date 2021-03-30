package br.com.sevencomm.bradescoutils.uorg.pageobjects.duplavalidacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.constants.TempoTimeouts;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento.TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaDuplaValidacaoHierarquiaEmpresa extends TelaBase {
	private By selectTipoHierarquia = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.selectHierarquia"));

	private By inputCNPJEmpresaSolicitante = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.inputCNPJEmpresaSolicitante"));
	private By botaoCNPJEmpresaSolicitante = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.botaoCNPJEmpresaSolicitante"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.botaoCNPJEmpresaSubordinada"));

	private By imgCalendarDataInicioVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 1);
	private By imgCalendarDataFimVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 2);

	private By botaoConsultar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.duplaValidacao.telaDupValidHierEmprs.botaoConsultar"));

	public TelaDuplaValidacaoHierarquiaEmpresa(WebDriver driver) {
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

	public void insereTextoInputCNPJEmpresaSolicitante(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSolicitante, value);
	}

	public void clicaBotaoCNPJEmpresaSolicitante() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSolicitante);
	}

	public void insereTextoInputCNPJEmpresaSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSubordinada, value);
	}

	public void clicaBotaoCNPJEmpresaSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSubordinada);
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

	public void preencheDadosConsultaSolicitante(String textoCNPJSuperior, TipoHierarquia tipoHierarquia,
			String diaInicio, String diaFim) {
		this.insereTextoInputCNPJEmpresaSolicitante(textoCNPJSuperior);
		this.clicaBotaoCNPJEmpresaSolicitante();
		this.selecionaTipoHierarquia(tipoHierarquia);

		this.selecionaDiaDataInicioVigencia(diaInicio);
		this.selecionaDiaDataFimVigencia(diaFim);
	}

	public TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa clicaBotaoConsultar() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoConsultar);

		return new TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}
}
