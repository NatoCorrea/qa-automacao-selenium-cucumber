package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class AddContasPage extends Actions {

    public AddContasPage(WebDriver navegador) {
        driver = navegador;
    }

    public By fieldNome = By.id("nome");

}
