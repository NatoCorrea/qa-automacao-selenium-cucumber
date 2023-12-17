package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.AddContasPage;
import pages.ContasPage;
import pages.HomePage;
import pages.LoginPage;

import static steps.Hooks.driver;

public class HomeSteps{
    HomePage homePage = new HomePage(driver);
    AddContasPage addContasPage = new AddContasPage(driver);
    ContasPage contasPage = new ContasPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    @Entao("o sistema mostrara uma mensagem de sucesso {string}")
    public void o_sistema_mostrara_uma_mensagem_de_sucesso(String mensagem) {
        homePage.validaHome(mensagem);
    }

    @Dado("que o usuario esteja logado e na home page")
    public void que_o_usuario_esteja_logado_e_na_home_page() {
         loginPage.preencherLogin("teste@teste.com", "123456");
         loginPage.clicarBtnLogin();
        Assert.assertEquals("https://seubarriga.wcaquino.me/logar", homePage.getURL());
    }
    @Quando("clicar no botao contas e depois no botao adicionar")
    public void clicar_no_botao_contas_e_depois_no_botao_adicionar() {
        homePage.clickBtnContas("Adicionar");
    }

    @Quando("clicar no botao contas e depois no botao listar")
    public void clicar_no_botao_contas_e_depois_no_botao_listar() {
        homePage.clickBtnContas("Listar");
    }

}
