package br.com.sevencomm.bradescoutils.uorg.pageobjects.menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento.TelaManutencaoIndividualDeHierarquiaDaUnidade;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento.TelaManutencaoIndividualDeHierarquiaDeEmpresa;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaMenuAgrupamentos extends TelaBase {
	private String menuMaInDeHiEmp = PropertiesUtils.getVariable("telas.menus.principal.Agrupamentos.menuMaInDeHiEmp");
	private By menuManutencaoIndividualDeHierarquiaDeEmpresa = ByUtils.encontraByTexto(ByUtils.A_LINK, menuMaInDeHiEmp);

	private String menuMaInDeHiUnid = PropertiesUtils
			.getVariable("telas.menus.principal.Agrupamentos.menuMaInDeHiUnid");
	private By menuManutencaoIndividualDeHierarquiaDaUnidade = ByUtils.encontraByTexto(ByUtils.A_LINK,
			menuMaInDeHiUnid);

	public TelaMenuAgrupamentos(WebDriver driver) {
		super(driver);
	}

	public TelaManutencaoIndividualDeHierarquiaDeEmpresa clicaMenuManutencaoIndividualDeHierarquiaDeEmpresa() {
		this.getElemento().elementoWebClica(this.menuManutencaoIndividualDeHierarquiaDeEmpresa);
		return new TelaManutencaoIndividualDeHierarquiaDeEmpresa(this.getDriver());
	}

	public TelaManutencaoIndividualDeHierarquiaDaUnidade clicaMenuManutencaoIndividualDeHierarquiaDaUnidade() {
		this.getElemento().elementoWebClica(this.menuManutencaoIndividualDeHierarquiaDaUnidade);
		return new TelaManutencaoIndividualDeHierarquiaDaUnidade(this.getDriver());
	}
}
