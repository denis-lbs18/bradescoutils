package br.com.sevencomm.bradescoutils.uorg.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.agrupamento.TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaInclusãoDeHierarquiaDaUnidade {
	private static Usuario usuario = UsuarioUtils.pegaUsuarioGestao();

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		TelaMenuPrincipal telaMenuPrincipal = telaDeLogin.realizaLogin(usuario);

		TelaIncluirManutencaoIndividualDeHierarquiaDaUnidade telaIncluir = telaMenuPrincipal.clicaMenuAgrupamentos()
				.clicaMenuManutencaoIndividualDeHierarquiaDaUnidade().clicaBotaoIncluir();

		telaIncluir.preencheDados();
		telaIncluir.clicaBotaoConfirmar();
	}
}