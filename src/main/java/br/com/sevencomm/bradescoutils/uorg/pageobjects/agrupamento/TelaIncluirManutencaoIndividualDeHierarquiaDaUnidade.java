package br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.constants.TempoTimeouts;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquiaUnidade;
import br.com.sevencomm.bradescoutils.modelos.MassaDeDadosManutencaoIndividualUnidade;
import br.com.sevencomm.bradescoutils.utils.GeradorMassaDeDadosUtils;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade extends TelaBase {
	private By selectTipoHierarquia = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.selectHierarquia"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.botaoCNPJEmpresaSubordinada"));

	private By selectTipoUnidadeSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.selectTipoUnidadeSubordinada"));
	private By selectTipoCodigoSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.selectTipoCodigoSubordinada"));
	private By inputCodigoSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.inputCodigoSubordinada"));
	private By botaoCodigoSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.botaoCodigoSubordinada"));

	private By inputCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.inputCNPJEmpresaSuperior"));
	private By botaoCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.botaoCNPJEmpresaSuperior"));

	private By selectTipoUnidadeSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.selectTipoUnidadeSuperior"));
	private By selectTipoCodigoSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.selectTipoCodigoSuperior"));
	private By inputCodigoSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.inputCodigoSuperior"));
	private By botaoCodigoSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.botaoCodigoSuperior"));

	private By botaoConfirmar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.incluir.botaoConfirmar"));

	public TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade(WebDriver driver) {
		super(driver);
	}

	public void selecionaTipoHierarquia(TipoHierarquiaUnidade tipo) {
		this.getElemento().elementoWebSelecionaLista(this.selectTipoHierarquia, tipo.toString());
	}

	public void selecionaTipoHierarquia(Integer index) {
		this.getElemento().elementoWebSelecionaLista(this.selectTipoHierarquia, index);
	}

	public void insereTextoInputCNPJEmpresaSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSubordinada, value);
	}

	public void clicaBotaoCNPJEmpresaSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSubordinada);
	}

	public void insereTextoInputCNPJEmpresaSuperior(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSuperior, value);
	}

	public void clicaBotaoCNPJEmpresaSuperior() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSuperior);
	}

	public void selecionaTipoUnidadeSubordinada(String tipo) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSubordinada, tipo);
	}

	public void selecionaTipoUnidadeSubordinada(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSubordinada, index);
	}

	public void selecionaTipoCodigoSubordinada(String tipo) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoCodigoSubordinada, tipo);
	}

	public void selecionaTipoCodigoSubordinada(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoCodigoSubordinada, index);
	}

	public void insereTextoInputCodigoSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSubordinada, value);
	}

	public void clicaBotaoCodigoSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSubordinada);
	}

	public void selecionaTipoUnidadeSuperior(String tipo) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSuperior, tipo);
	}

	public void selecionaTipoUnidadeSuperior(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSuperior, index);
	}

	public void selecionaTipoCodigoSuperior(String tipo) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoCodigoSuperior, tipo);
	}

	public void selecionaTipoCodigoSuperior(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoCodigoSuperior, index);
	}

	public void insereTextoInputCodigoSuperior(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSuperior, value);
	}

	public void clicaBotaoCodigoSuperior() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSuperior);
	}

	public void clicaBotaoConfirmar() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoConfirmar);
	}

	public void preencheDados() {
		MassaDeDadosManutencaoIndividualUnidade massaDeDados = GeradorMassaDeDadosUtils
				.geraMassaDeDadosManutencaoIndividualUnidadeIncluir();
		this.selecionaTipoHierarquia(massaDeDados.getTipoHierarquia());

		this.insereTextoInputCNPJEmpresaSubordinada(massaDeDados.getCnpjEmpresaSubordinada());
		this.clicaBotaoCNPJEmpresaSubordinada();

		this.selecionaTipoUnidadeSubordinada(massaDeDados.getTipoUnidadeSubordinada());
		this.selecionaTipoCodigoSubordinada(massaDeDados.getTipoCodigoSubordinada());
		this.insereTextoInputCodigoSubordinada(massaDeDados.getCodigoSubordinada());
		this.clicaBotaoCodigoSubordinada();

		this.insereTextoInputCNPJEmpresaSuperior(massaDeDados.getCnpjEmpresaSuperior());
		this.clicaBotaoCNPJEmpresaSuperior();

		this.selecionaTipoUnidadeSuperior(massaDeDados.getTipoUnidadeSuperior());
		this.selecionaTipoCodigoSuperior(massaDeDados.getTipoCodigoSuperior());
		this.insereTextoInputCodigoSuperior(massaDeDados.getCodigoSuperior());
		this.clicaBotaoCodigoSuperior();

		this.insereTextoInputCNPJEmpresaSuperior(massaDeDados.getCnpjEmpresaSuperior());
		this.clicaBotaoCNPJEmpresaSuperior();

	}
}
