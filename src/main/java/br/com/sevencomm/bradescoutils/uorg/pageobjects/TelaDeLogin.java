package br.com.sevencomm.bradescoutils.uorg.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import br.com.denisluna.selenium_utils.modelos.TelaBase;
import br.com.denisluna.selenium_utils.modelos.Usuario;
import br.com.denisluna.selenium_utils.utils.constants.TempoTimeouts;
import br.com.sevencomm.bradescoutils.uorg.pageobjects.menus.TelaMenuPrincipal;
import br.com.sevencomm.bradescoutils.utils.PropertiesUtils;

public class TelaDeLogin extends TelaBase {

	public TelaDeLogin(WebDriver driver) {
		super(driver);
	}

	public TelaMenuPrincipal realizaLogin(Usuario usuario) {
		String url = PropertiesUtils.getVariable("sistema.uorg.url");
		this.navega(url);
		this.sleep(2);

		try {
			this.realizaLoginRobot(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new TelaMenuPrincipal(this.getDriver());
	}

	public void realizaLoginRobot(Usuario usuario) throws Exception {

		// wait - increase this wait period if required
		Thread.sleep(TempoTimeouts.TEMPO_MEDIO_LONG);

		// create robot for keyboard operations
		Robot rb = new Robot();

		StringSelection username = new StringSelection(usuario.getUsuario());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(TempoTimeouts.TEMPO_CURTO_LONG);

		StringSelection pwd = new StringSelection(usuario.getSenha());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		// press enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// wait
		Thread.sleep(TempoTimeouts.TEMPO_CURTO_LONG);
	}
}