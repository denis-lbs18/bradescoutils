package br.com.sevencomm.bradescoutils.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.pageobjects.agrupamento.TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa;
import br.com.sevencomm.bradescoutils.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaInclusãoDeHierarquia {
	private static Usuario usuario = UsuarioUtils.pegaUsuarioGestao();

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		TelaMenuPrincipal telaMenuPrincipal = telaDeLogin.realizaLogin(usuario);

		TelaIncluirManutencaoIndividualDeHierarquiaDeEmpresa telaIncluir = telaMenuPrincipal.clicaMenuAgrupamentos()
				.clicaMenuManutencaoIndividualDeHierarquiaDeEmpresa().clicaBotaoIncluir();

		telaIncluir.preencheDados();
		telaIncluir.clicaBotaoConfirmar();
	}
}