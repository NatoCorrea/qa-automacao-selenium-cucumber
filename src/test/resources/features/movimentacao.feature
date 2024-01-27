#language: pt
Funcionalidade: Utilizar a botao criar movimentacao da barra de navegacao

  Contexto:
    Dado que o usuario esteja logado e na MovimentacaoPage

  Cenario: Criando movimentacao
    Quando o usuario selecionar o tipo de movimentacao e preencher todos os campos obrigatorios
    E o usuario selecionar a conta e a situacao
    Entao o sistema mostrara mensagem de sucesso