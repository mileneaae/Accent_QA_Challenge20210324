#language: pt
#Caso de teste 2
Funcionalidade: busca em um site
    Este é um exercício para encontrar o manifesto
    dento do site da GamaCaso de teste 2

Cenario:
    Dado que eu estou no site da gama academy "https://pages.gama.academy/curso-de-product-management/"
    E clico na opcao "QUERO IR PARA O PRÓXIMO NÍVEL"
    Entao devo ver o valor e o botao comprar agora

Cenario: 
    Dado que eu estou no site da gama academy "https://www.gama.academy/"
    E clico na opcao "DEV FULL STACK"
    Entao ver as opcoes
        |Crie seu portfólio!|
        |Acompanhamento de Carreira|
        |Professores de surf que sabem surfar!|
        |Estude na Melhor Startup de Educação|