package br.com.sevencomm.bradescoutils.pageobjects.agrupamento;

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
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.selectHierarquia"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.botaoCNPJEmpresaSubordinada"));

	private By selectTipoUnidadeSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.selectTipoUnidadeSubordinada"));

	private By inputCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.inputCNPJEmpresaSuperior"));
	private By botaoCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.botaoCNPJEmpresaSuperior"));

	private By botaoConfirmar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.incluir.botaoConfirmar"));

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
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSubordinada, tipo);
	}

	public void selecionaTipoUnidadeSubordinada(Integer index) {
		this.getElemento().elementoWebSelecionaLista(this.selectTipoUnidadeSubordinada, index);
	}

	public void clicaBotaoConfirmar() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoConfirmar);
	}

	public void preencheDados() {
		MassaDeDadosManutencaoIndividualUnidade massaDeDados = GeradorMassaDeDadosUtils
				.geraMassaDeDadosManutencaoIndividualUnidade();
		this.selecionaTipoHierarquia(massaDeDados.getTipoHierarquia());
		this.insereTextoInputCNPJEmpresaSubordinada(massaDeDados.getCnpjSequenciaEmpresaSubordinada());
		this.clicaBotaoCNPJEmpresaSubordinada();

		this.selecionaTipoUnidadeSubordinada(massaDeDados.getTipoUnidade());

		this.insereTextoInputCNPJEmpresaSuperior(massaDeDados.getCnpjSequenciaEmpresaSuperior());
		this.clicaBotaoCNPJEmpresaSuperior();

	}
}
