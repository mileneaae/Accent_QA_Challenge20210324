#language: pt
#Caso de teste 1
Funcionalidade: busca em um site
    Este é um exercício para encontrar o manifesto
    dento do site da Gama

Cenario: entrar no site da gama, clicar no qem somos e achar o manifesto
  Dado que eu estou no site da gama academy "https://www.gama.academy/"
  E fecho o pup-up
  E clico na opcao Quem somos
  Entao deve ver o item do "MANIFESTO"