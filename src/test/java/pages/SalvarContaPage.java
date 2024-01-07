package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class SalvarContaPage extends Actions {

    public SalvarContaPage(WebDriver navegador){ driver = navegador; }
    public By msgValidacao = By.className("alert");

    public void ValidaContaAdd(String _messagem){
        get_text(msgValidacao, _messagem);
    }
}
