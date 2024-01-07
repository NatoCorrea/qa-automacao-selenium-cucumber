package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class LoginPage extends Actions {
    public LoginPage(WebDriver navegador) {
        driver = navegador;
    }
    private By campoEmail = By.id("email");
    private By campoPassword = By.id("senha");
    private By btnEntrar = By.cssSelector("button[type=submit]");
    private By messagem = By.className("alert");

    public void preencherLogin(String email, String password) {
        set(campoEmail, email);
        set(campoPassword, password);
    }

    public void clicarBtnLogin() {
        click(btnEntrar);
    }
    public void validaPaginaLogin() {
        driver.get("https://seubarriga.wcaquino.me/login");
    }
    public void mensagemErro(String _messagem){
        get_text(messagem, _messagem);
    }
}

