#language: pt
#Caso de teste 2
Funcionalidade: busca em um site
    Este é um exercício para encontrar o manifesto
    dento do site da GamaCaso de teste 2

Cenario:
    Dado que eu estou no site da gama academy "https://pages.gama.academy/curso-de-product-management/"
    E cliclo na opção "QUERO IR PARA O PRÓXIMO NÍVEL"
    Então devo ver o valor e o botão comprar agora

Cenario: 
    Dado que eu estou no site da gama academy "https://www.gama.academy/"
    E cliclo na opção "DEV FULL STACK"
    Então ver as opções
        |Crie seu portfólio!|
        |Acompanhamento de Carreira|
        |Professores de surf que sabem surfar!|
        |Estude na Melhor Startup de Educação|