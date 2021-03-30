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

public class TelaManutencaoIndividualDeHierarquiaDaUnidade extends TelaBase {
	private By selectTipoHierarquia = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.selectHierarquia"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.botaoCNPJEmpresaSubordinada"));

	private By selectUnidade = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.selectUnidade"));
	private By selectCodigo = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.selectCodigo"));
	private By inputCodigo = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.inputCodigo"));
	private By inputNomeUnidade = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.inputNomeUnidade"));

	private By inputCodigoSequencialUnidade = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.inputCodigoSequencialUnidade"));
	private By botaoCodigoSequencialUnidade = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.botaoCodigoSequencialUnidade"));

	private By imgCalendarDataInicioVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 1);
	private By imgCalendarDataFimVigencia = ByUtils.encontraByClass(ByUtils.IMG,
			PropertiesUtils.getVariable("telas.geral.classes.calendario"), 2);

	private By botaoIncluir = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.botaoIncluir"));
	private By botaoConsultar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiUnid.botaoConsultar"));

	public TelaManutencaoIndividualDeHierarquiaDaUnidade(WebDriver driver) {
		super(driver);
	}

	public void selecionaTipoHierarquia(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectTipoHierarquia, value);
	}

	public void selecionaTipoHierarquia(TipoHierarquiaUnidade tipo) {
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

	public void selecionaUnidade(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectUnidade, value);
	}

	public void selecionaUnidade(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectUnidade, index);
	}

	public void selecionaCodigo(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectCodigo, value);
	}

	public void selecionaCodigo(Integer index) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebSelecionaLista(this.selectCodigo, index);
	}

	public void insereTextoInputCodigo(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigo, value);
	}

	public void insereTextoInputNomeUnidade(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputNomeUnidade, value);
	}

	public void insereTextoInputCodigoSequencialUnidade(String value) {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSequencialUnidade, value);
	}

	public void clicaBotaoCodigoSequencialUnidade() {
		this.sleep(TempoTimeouts.TEMPO_PADRAO_TELA_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSequencialUnidade);
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

	public void preencheDadosConsulta() {
		MassaDeDadosManutencaoIndividualUnidade massaDeDados = GeradorMassaDeDadosUtils
				.geraMassaDeDadosManutencaoIndividualUnidadeConsulta();
		this.selecionaTipoHierarquia(massaDeDados.getTipoHierarquia());
		this.insereTextoInputCNPJEmpresaSubordinada(massaDeDados.getCnpjEmpresaSubordinada());
		this.clicaBotaoCNPJEmpresaSubordinada();

		this.selecionaUnidade(massaDeDados.getTipoUnidadeSubordinada());
		this.selecionaCodigo(massaDeDados.getTipoCodigoSubordinada());
		this.insereTextoInputCodigo(massaDeDados.getCodigoSubordinada());
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.clicaBotaoCodigoSequencialUnidade();
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);

//		this.clicaBotaoConsultar();
	}

	public TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa clicaBotaoConsultar() {
		this.getElemento().elementoWebClica(this.botaoConsultar);

		return new TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}

	public TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade clicaBotaoIncluir() {
		this.getElemento().elementoWebClica(this.botaoIncluir);

		return new TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade(this.getDriver());
	}

}
