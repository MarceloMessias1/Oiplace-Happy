#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Validar informação com email invalido
  Eu como usuario quero tentar contratar servico com email invalido

Background: 
Given que esteja no site "https://www.oiplace.com.br/"

  Scenario: Aderir Consultas Online
    
      
    When que eu clica no banner vai bem
    And clique em quero aderir
    And clique em contratar
    But inserir email invalido
    Then sistema emitira aviso de advertencia
    
    Scenario: Duvidas Frequentes
    
    When clicar vai bem
    And clicar como faco meu cartao vai bem
    Then valido texto com informacao desejada
    