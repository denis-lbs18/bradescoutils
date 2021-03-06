package br.com.sevencomm.bradescoutils.uorg.pageobjects.menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaMenuPrincipal extends TelaBase {
	private By menuAgrupamentos = ByUtils.encontraByTexto(ByUtils.A_LINK,
			PropertiesUtils.getVariable("telas.menus.principal.Agrupamentos"));
	private By menuDuplaValidacao = ByUtils.encontraByTexto(ByUtils.A_LINK,
			PropertiesUtils.getVariable("telas.menus.principal.DuplaValidacao"));

	public TelaMenuPrincipal(WebDriver driver) {
		super(driver);
	}

	public TelaMenuAgrupamentos clicaMenuAgrupamentos() {
		WebElement element = getDriver().findElement(menuAgrupamentos);
		System.out.println(element.getLocation());

		this.getElemento().elementoWebClica(this.menuAgrupamentos);
		return new TelaMenuAgrupamentos(this.getDriver());
	}

	public TelaMenuDuplaValidacao clicaMenuDuplaValidacao() {
		this.getElemento().elementoWebClica(this.menuDuplaValidacao);
		return new TelaMenuDuplaValidacao(this.getDriver());
	}

}
