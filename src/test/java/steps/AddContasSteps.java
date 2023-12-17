package steps;

import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.AddContasPage;

import static steps.Hooks.driver;

public class AddContasSteps {

    AddContasPage addContasPage = new AddContasPage(driver);
    @Entao("o sistema sera redirecionado para pagina de criacao de contas")
    public void o_sistema_sera_redirecionado_para_pagina_de_criacao_de_contas() {
        Assert.assertEquals("https://seubarriga.wcaquino.me/addConta",addContasPage.getURL());
    }
}
