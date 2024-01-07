package steps;

import io.cucumber.java.pt.Entao;
import org.junit.Assert;
import pages.ContasPage;
import static steps.Hooks.driver;

public class ContasSteps{
    ContasPage contasPage = new ContasPage(driver);
    @Entao("o sistema sera redirecionado para pagina de contas")
    public void o_sistema_sera_redirecionado_para_pagina_de_contas() {
        Assert.assertEquals("https://seubarriga.wcaquino.me/contas", contasPage.getURL());
//        screenshot();
    }
}
