package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import static steps.Hooks.driver;

public class HomeSteps {
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    @Entao("o sistema mostrara uma mensagem de sucesso {string}")
    public void o_sistema_mostrara_uma_mensagem_de_sucesso(String mensagem) {
        homePage.validaHome(mensagem);
    //        screenshot();
    }
    @Dado("que o usuario esteja logado e na home page")
    public void que_o_usuario_esteja_logado_e_na_home_page() {
         loginPage.preencherLogin("testando@qa.com", "123456");
         loginPage.clicarBtnLogin();
         Assert.assertEquals("https://seubarriga.wcaquino.me/logar" , homePage.getURL());
    //        screenshot();
    }
    @Quando("o usuario clicar no botao contas e depois no botao adicionar")
    public void clicar_no_botao_contas_e_depois_no_botao_adicionar() {
        homePage.clickBtnContas("Adicionar");
    }

    @Quando("o usuario clicar no botao contas e depois no botao listar")
    public void clicar_no_botao_contas_e_depois_no_botao_listar() {
        homePage.clickBtnContas("Listar");
    }

    @Quando("o usuario clicar no botao criar movimentacao")
    public void o_usuario_clicar_no_botao_criar_movimentacao() {
        homePage.clickBtnCriarMovimentacao();
    }
    @Entao("o sistema sera redirecionado para pagina de movimentacao")
    public void o_sistema_sera_redirecionado_para_pagina_de_movimentacao() {
        Assert.assertEquals("https://seubarriga.wcaquino.me/movimentacao", homePage.getURL());
    //        screenshot();
    }
}
