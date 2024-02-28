package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Actions;

public class MovimentacaoPage extends Actions {
    public MovimentacaoPage(WebDriver navegador) {driver = navegador;}
    public By tipoReceita = By.cssSelector("#tipo > option:nth-child(1)");
    public By tipoDespesa = By.cssSelector("#tipo > option:nth-child(2)");
    public By dataTransacao = By.id("data_transacao");
    public By dataPagamento = By.id("data_pagamento");
    public By descricao = By.id("descricao");
    public By interessado = By.id("interessado");
    public By valor = By.id("valor");
    public By conta = By.id("conta");
    public By selecionarConta = By.id("#conta > option:nth-child(1)");
    public By pago = By.id("status_pago");
    public By pendente = By.id("status_pendente");
    public By btnSalvar = By.cssSelector("div.btn-group > button");

    public void selecionarTipoMovimentacaoReceita(){
        select(tipoReceita);
    }
    public void selecionarTipoMovimentacaoDespesa(){
        select(tipoDespesa);
    }
    public void preencherDataMovimentacao(){
        set(dataTransacao, "11/10/2020"); //utilizar uma data random);
    }
    public void preencherDataPagamento(){
        set(dataPagamento, "12/10/2020"); //utilizar uma data random);
    }
    public void preencherDescricao(){
        set(descricao, "Testando Descricao");
    }
    public void preencherInteressado(){
        set(interessado, "QA - Renato Corrêa");
    }
    public void preencherValor(){
        set(valor, "300.0");
    }
    public void selecionarConta(){
        select(selecionarConta);
    }
    public void clickPago(){
        click(pago);
    }
    public void clickPendente(){
        click(pendente);
    }
    public void clickSalvar(){
        click(btnSalvar);
    }
}

