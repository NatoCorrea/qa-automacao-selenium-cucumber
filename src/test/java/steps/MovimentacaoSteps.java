package steps;

import io.cucumber.java.pt.*;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.MovimentacaoPage;
import pages.SalvarContaPage;

import static steps.Hooks.driver;

public class MovimentacaoSteps {

    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    MovimentacaoPage movimentacaoPage = new MovimentacaoPage(driver);
    SalvarContaPage salvarContaPage = new SalvarContaPage(driver);
    @Dado("que o usuario esteja logado e na MovimentacaoPage")
    public void que_o_usuario_esteja_logado_e_na_movimentacao_page() {
        loginPage.preencherLogin("testando@qa.com", "123456");
        loginPage.clicarBtnLogin();
        homePage.clickBtnCriarMovimentacao();
        Assert.assertEquals("https://seubarriga.wcaquino.me/movimentacao", movimentacaoPage.getURL());
    //        screenshot();
    }

    @Quando("o usuario selecionar o tipo de movimentacao receita e preencher todos os campos obrigatorios")
    public void o_usuario_selecionar_o_tipo_de_movimentacao_receita_e_preencher_todos_os_campos_obrigatorios() {
        movimentacaoPage.selecionarTipoMovimentacaoReceita();
        movimentacaoPage.preencherDataMovimentacao();
        movimentacaoPage.preencherDataPagamento();
        movimentacaoPage.preencherDescricao();
        movimentacaoPage.preencherInteressado();
        movimentacaoPage.preencherValor();

    }

    @Quando("o usuario selecionar o tipo de movimentacao despesa e preencher todos os campos obrigatorios")
    public void o_usuario_selecionar_o_tipo_de_movimentacao_despesa_e_preencher_todos_os_campos_obrigatorios() {
        movimentacaoPage.selecionarTipoMovimentacaoDespesa();
        movimentacaoPage.preencherDataMovimentacao();
        movimentacaoPage.preencherDataPagamento();
        movimentacaoPage.preencherDescricao();
        movimentacaoPage.preencherInteressado();
        movimentacaoPage.preencherValor();
    }

    @Quando("o usuario selecionar a conta e a situacao pago e clicar em salvar")
    public void o_usuario_selecionar_a_conta_e_a_situacao_pago_e_clicar_em_salvar() {
        movimentacaoPage.selecionarConta();
        movimentacaoPage.clickPago();
        movimentacaoPage.clickSalvar();
    }

    @Quando("o usuario selecionar a conta e a situacao pendente e clicar em salvar")
    public void o_usuario_selecionar_a_conta_e_a_situacao_pendente() {
        movimentacaoPage.selecionarConta();
        movimentacaoPage.clickPendente();
        movimentacaoPage.clickSalvar();
    }
    @Entao("o sistema mostrara mensagem de sucesso")
    public void o_sistema_mostrara_mensagem_de_sucesso() {
        salvarContaPage.ValidaContaAdd("Movimentação adicionada com sucesso!");
    }
}
