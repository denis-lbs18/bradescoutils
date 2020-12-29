package br.com.sevencomm.bradescoutils.pageobjects.agrupamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaManutencaoIndividualDeHierarquiaDaUnidade extends TelaBase {
	private By botaoIncluir = ByUtils
			.encontraByID(PropertiesUtils.getVariable("telas.agrupamentos.menuMaInDeHiUnid.botaoIncluir"));

	public TelaManutencaoIndividualDeHierarquiaDaUnidade(WebDriver driver) {
		super(driver);
	}

	public TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade clicaBotaoIncluir() {
		this.getElemento().elementoWebClica(this.botaoIncluir);

		return new TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade(this.getDriver());
	}

}
