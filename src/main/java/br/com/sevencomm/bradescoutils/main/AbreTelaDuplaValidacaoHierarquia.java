package br.com.sevencomm.bradescoutils.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.pageobjects.duplavalidacao.TelaDuplaValidacaoHierarquiaEmpresa;
import br.com.sevencomm.bradescoutils.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaDuplaValidacaoHierarquia {
	private static final Usuario usuario = UsuarioUtils.pegaUsuarioValidador();

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		TelaMenuPrincipal telaMenuPrincipal = telaDeLogin.realizaLogin(usuario);

		TelaDuplaValidacaoHierarquiaEmpresa telaDuplaValidacaoHierarquiaEmpresa = telaMenuPrincipal
				.clicaMenuDuplaValidacao().clicaMenuDuplaValidacaoHierarquiaDaEmpresa();
		telaDuplaValidacaoHierarquiaEmpresa.selecionaTipoHierarquia(TipoHierarquia.TESTE_EMPRESA);
		telaDuplaValidacaoHierarquiaEmpresa.clicaBotaoConsultar();
	}
}