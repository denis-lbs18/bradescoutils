package br.com.sevencomm.bradescoutils.pageobjects.menus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.utils.selenium.ByUtils;
import br.com.sevencomm.bradescoutils.pageobjects.duplavalidacao.TelaDuplaValidacaoHierarquiaEmpresa;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaMenuDuplaValidacao extends TelaBase {
	private String menuHierEmprs = PropertiesUtils
			.getVariable("telas.menus.principal.DuplaValidacao.menuDupValidHierEmprs");
	private By menuHierarquiaDaEmpresa = ByUtils.encontraByTexto(ByUtils.A_LINK, menuHierEmprs);

	public TelaMenuDuplaValidacao(WebDriver driver) {
		super(driver);
	}

	public TelaDuplaValidacaoHierarquiaEmpresa clicaMenuDuplaValidacaoHierarquiaDaEmpresa() {
		this.getElemento().elementoWebClica(this.menuHierarquiaDaEmpresa);
		return new TelaDuplaValidacaoHierarquiaEmpresa(this.getDriver());
	}
}
