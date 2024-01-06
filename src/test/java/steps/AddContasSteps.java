package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.AddContasPage;
import pages.HomePage;
import pages.LoginPage;

import java.util.Random;

import static steps.Hooks.driver;

public class AddContasSteps {

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    AddContasPage addContasPage = new AddContasPage(driver);
    @Entao("o sistema sera redirecionado para pagina de criacao de contas")
    public void o_sistema_sera_redirecionado_para_pagina_de_criacao_de_contas() {
        Assert.assertEquals("https://seubarriga.wcaquino.me/addConta",addContasPage.getURL());//addScreenshot
    }
    @Dado("que o usuario esteja logado e na AddContasPage")
    public void que_o_usuario_esteja_logado_e_na_add_contas_page() {
        loginPage.preencherLogin("testando@qa.com", "123456");
        loginPage.clicarBtnLogin();
        homePage.clickBtnContas("Adicionar");
        Assert.assertEquals("https://seubarriga.wcaquino.me/addConta", addContasPage.getURL()); //addScreenshot
    }
    @Quando("o usuario escrever o nome da conta nova no campo em branco e clicar no botao salvar")
    public void o_usuario_escrever_o_nome_da_conta_nova_no_campo_em_branco_e_clicar_no_botao_salvar() {
        addContasPage.adicionandoNovaConta();
    }
    @Entao("o sistema redirecionara para a pagina de contas e mostrara mensagem de sucesso")
    public void o_sistema_redirecionara_para_a_pagina_de_contas_e_mostrara_mensagem_de_sucesso() {

    }
}
