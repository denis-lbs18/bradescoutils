package br.com.sevencomm.bradescoutils.uorg.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.enums.TipoHierarquia;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.duplavalidacao.TelaDuplaValidacaoHierarquiaEmpresa;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaDuplaValidacaoConsultar {
	private static final Usuario usuario = UsuarioUtils.pegaUsuarioValidador();
	private static final String MASSA_DADOS_CODIGO_EMPRESA_SUBORDINADA = PropertiesUtils
			.getVariable("massa.user.dados.cnpj.superior");

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		TelaMenuPrincipal telaMenuPrincipal = telaDeLogin.realizaLogin(usuario);

		TelaDuplaValidacaoHierarquiaEmpresa telaDuplaValidacaoHierarquiaEmpresa = telaMenuPrincipal
				.clicaMenuDuplaValidacao().clicaMenuDuplaValidacaoHierarquiaDaEmpresa();
		telaDuplaValidacaoHierarquiaEmpresa.preencheDadosConsultaSolicitante(MASSA_DADOS_CODIGO_EMPRESA_SUBORDINADA,
				TipoHierarquia.TESTE_EMPRESA, "7", "8");
		telaDuplaValidacaoHierarquiaEmpresa.clicaBotaoConsultar();
	}
}