#language: pt
Funcionalidade: busca em site
    Fizemos no curso um sistema que faz uma validacao de CPF
    com isso estamos criando um teste para automatizar o processo de validacao

Cenario: Entrar no site do tornese um programador e buscar pelo conteudo tdd
  Dado que que estou no site do tornese um programador
  E digito no campo de busca a palavra "tdd"
  E clico no botao de buscar
  Entao devo ver o resultado na busca


Cenario: Entrar no site do tornese um programador e buscar pelo conteudo bdd
  Dado que que estou no site do tornese um programador
  E digito no campo de busca a palavra "bdd"
  E clico no botao de buscar
  Entao devo ver o resultado na busca