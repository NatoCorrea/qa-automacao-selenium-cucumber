#language: pt
Funcionalidade: Utilizar a botao criar movimentacao da barra de navegacao

  Contexto:
    Dado que o usuario esteja logado e na MovimentacaoPage

  Cenario: Criando tipo de movimentacao receita e situacao pago
    Quando o usuario selecionar o tipo de movimentacao receita e preencher todos os campos obrigatorios
    E o usuario selecionar a conta e a situacao pago e clicar em salvar
    Entao o sistema mostrara mensagem de sucesso

  Cenario: Criando tipo de movimentacao receita e situacao pendente
    Quando o usuario selecionar o tipo de movimentacao receita e preencher todos os campos obrigatorios
    E o usuario selecionar a conta e a situacao pendente e clicar em salvar
    Entao o sistema mostrara mensagem de sucesso


  Cenario: Criando tipo de movimentacao despesa e situacao pago
    Quando o usuario selecionar o tipo de movimentacao despesa e preencher todos os campos obrigatorios
    E o usuario selecionar a conta e a situacao pago e clicar em salvar
    Entao o sistema mostrara mensagem de sucesso

  Cenario: Criando tipo de movimentacao despesa e situacao pendente
    Quando o usuario selecionar o tipo de movimentacao despesa e preencher todos os campos obrigatorios
    E o usuario selecionar a conta e a situacao pendente e clicar em salvar
    Entao o sistema mostrara mensagem de sucesso