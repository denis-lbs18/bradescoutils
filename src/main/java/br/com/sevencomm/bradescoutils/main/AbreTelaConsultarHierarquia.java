package br.com.sevencomm.bradescoutils.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.pageobjects.agrupamento.TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa;
import br.com.sevencomm.bradescoutils.pageobjects.agrupamento.TelaManutencaoIndividualDeHierarquiaDeEmpresa;
import br.com.sevencomm.bradescoutils.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaConsultarHierarquia {
	private static final Usuario usuario = UsuarioUtils.pegaUsuarioGestao();
	private static final String MASSA_DADOS_CODIGO_EMPRESA_SUBORDINADA = PropertiesUtils
			.getVariable("massa.user.dados.codigosequencia.subordinada");

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		TelaMenuPrincipal telaMenuPrincipal = telaDeLogin.realizaLogin(usuario);

		TelaManutencaoIndividualDeHierarquiaDeEmpresa telaManutencao = telaMenuPrincipal.clicaMenuAgrupamentos()
				.clicaMenuManutencaoIndividualDeHierarquiaDeEmpresa();

		telaManutencao.preencheDadosConsulta(MASSA_DADOS_CODIGO_EMPRESA_SUBORDINADA, TipoHierarquia.TESTE_EMPRESA, "2", "25");
		TelaConsultarManutencaoIndividualDeHierarquiaDeEmpresa telaConsultar = telaManutencao.clicaBotaoConsultar();
	}
}