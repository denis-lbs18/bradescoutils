package br.com.sevencomm.bradescoutils.main;

import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.selenium.WebDriverUtils;
import br.com.sevencomm.bradescoutils.pageobjects.TelaDeLogin;
import br.com.sevencomm.bradescoutils.utils.UsuarioUtils;

public class AbreTelaPrincipal {
	private static Usuario usuario = UsuarioUtils.pegaUsuarioGestao();

	public static void main(String[] args) {
		TelaDeLogin telaDeLogin = new TelaDeLogin(WebDriverUtils.instanciaChromeDriver());
		telaDeLogin.realizaLogin(usuario);
	}

}
