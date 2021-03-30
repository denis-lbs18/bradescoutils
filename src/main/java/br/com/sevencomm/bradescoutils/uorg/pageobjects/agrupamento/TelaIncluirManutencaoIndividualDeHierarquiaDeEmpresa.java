package br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.thedeanda.lorem.LoremIpsum;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.constants.TempoTimeouts;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.modelos.MassaDeDadosManutencaoIndividualEmpresa;
import br.com.sevencomm.bradescoutils.utils.GeradorMassaDeDadosUtils;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa extends TelaBase {
	private By selectTipoHierarquia = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.selectHierarquia"));

	private By inputCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.inputCNPJEmpresaSubordinada"));
	private By botaoCNPJEmpresaSubordinada = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.botaoCNPJEmpresaSubordinada"));

	private By inputCodigoSequenciaEmpresaSubordinada = ByUtils.encontraByID(PropertiesUtils
			.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.inputCodigoSequenciaEmpresaSubordinada"));
	private By botaoCodigoSequenciaEmpresaSubordinada = ByUtils.encontraByID(PropertiesUtils
			.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.botaoCodigoSequenciaEmpresaSubordinada"));

	private By inputCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.inputCNPJEmpresaSuperior"));
	private By botaoCNPJEmpresaSuperior = ByUtils.encontraByID(
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.botaoCNPJEmpresaSuperior"));

	private By inputCodigoSequenciaEmpresaSuperior = ByUtils.encontraByID(PropertiesUtils
			.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.inputCodigoSequenciaEmpresaSuperior"));
	private By botaoCodigoSequenciaEmpresaSuperior = ByUtils.encontraByID(PropertiesUtils
			.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.botaoCodigoSequenciaEmpresaSuperior"));

	private By textAreaJustificativa = ByUtils.encontraByName(ByUtils.TEXTAREA,
			PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.textAreaJustificativa"));

	private By botaoConfirmar = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.telaMaInDeHiEmp.incluir.botaoConfirmar"));

	public TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa(WebDriver driver) {
		super(driver);
	}

	public void selecionaTipoHierarquia(TipoHierarquia tipo) {
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

	public void insereTextoInputCodigoSequenciaEmpresaSubordinada(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSequenciaEmpresaSubordinada, value);
	}

	public void clicaBotaoCodigoSequenciaEmpresaSubordinada() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSequenciaEmpresaSubordinada);
	}

	public void insereTextoInputCNPJEmpresaSuperior(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCNPJEmpresaSuperior, value);
	}

	public void clicaBotaoCNPJEmpresaSuperior() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCNPJEmpresaSuperior);
	}

	public void insereTextoInputCodigoSequenciaEmpresaSuperior(String value) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebInsereTexto(this.inputCodigoSequenciaEmpresaSuperior, value);
	}

	public void clicaBotaoCodigoSequenciaEmpresaSuperior() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoCodigoSequenciaEmpresaSuperior);
	}

	public void preencheTextAreaJustificativa(Integer tamanhoMaximo) {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);

		LoremIpsum lorem = new LoremIpsum();
		this.getElemento().elementoWebInsereTexto(this.textAreaJustificativa, lorem.getWords(tamanhoMaximo));
	}

	public TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa clicaBotaoConfirmar() {
		this.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
		this.getElemento().elementoWebClica(this.botaoConfirmar);

		return new TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}

	public void preencheDados() {
		MassaDeDadosManutencaoIndividualEmpresa massaDeDados = GeradorMassaDeDadosUtils.geraMassaDeDadosManutencaoIndividual();
		this.selecionaTipoHierarquia(massaDeDados.getTipoHierarquia());
		this.insereTextoInputCNPJEmpresaSubordinada(massaDeDados.getCnpjSequenciaEmpresaSubordinada());
		this.clicaBotaoCNPJEmpresaSubordinada();

		this.insereTextoInputCNPJEmpresaSuperior(massaDeDados.getCnpjSequenciaEmpresaSuperior());
		this.clicaBotaoCNPJEmpresaSuperior();

		this.preencheTextAreaJustificativa(50);
	}
}
