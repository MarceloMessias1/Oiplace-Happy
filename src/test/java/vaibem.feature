#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Validar informa��o com email invalido
  Eu como usuario quero tentar contratar servico com email invalido

Background: 
Given que esteja no site "https://www.oiplace.com.br/"

  Scenario: Aderir Consultas Online
    
      
    When que eu clica no banner vai bem
    And clique em quero aderir
    And clique em contratar
    But inserir email invalido
    Then sistema emitira aviso de advertencia