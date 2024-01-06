#language: pt
Funcionalidade: Utilizar a botao contas da barra de navegacao

  Contexto:
    Dado que o usuario esteja logado e na AddContasPage

  Cenario: Adicionando nova conta
    Quando o usuario escrever o nome da conta nova no campo em branco e clicar no botao salvar
    Entao o sistema redirecionara para a pagina de contas e mostrara mensagem de sucesso