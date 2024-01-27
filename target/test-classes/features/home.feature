#language: pt
Funcionalidade: Utilizar a barra de navegacao da home page

  Contexto:
      Dado que o usuario esteja logado e na home page

    Cenario: Navegacao para acessar pagina de adicionar contas
      Quando o usuario clicar no botao contas e depois no botao adicionar
      Entao o sistema sera redirecionado para pagina de criacao de contas

    Cenario: Navegacao para acessar pagina de listar contas
      Quando o usuario clicar no botao contas e depois no botao listar
      Entao o sistema sera redirecionado para pagina de contas

    Cenario: Navegacao para acessar pagina de criar movimentacao
      Quando o usuario clicar no botao criar movimentacao
      Entao o sistema sera redirecionado para pagina de movimentacao

