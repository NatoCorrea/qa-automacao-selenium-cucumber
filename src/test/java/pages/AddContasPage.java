package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;
import java.util.Random;

public class AddContasPage extends Actions {

    public AddContasPage(WebDriver navegador) {
        driver = navegador;
    }
    public By fieldNome = By.id("nome");
    public By btnSalvar = By.className("btn-group");
    Random random = new Random();
    String nomeConta = "Teste" + random.nextInt();

    public void adicionandoNovaConta(){
        set(fieldNome, nomeConta);
        click(btnSalvar);
    }

}
