#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

# @tag indica que a Feature ou Scenario será agrupado com outras que possuem o mesmo marcador.
@tag
Feature: Cliente faz saque de dinheiro 
  Como um cliente,
  eu gostaria de sacar dinheiro em caixa eletrônico,
  para que eu não tenha que esperar em uma fila do banco.

  # Cenário: Cliente especial com saldo negativo.
  # Este cenário testa a funcionalidade de saque para um cliente especial com saldo negativo.
  @tag1
  Scenario: Cliente especial com saldo negativo
    # Dado que o cliente especial tem um saldo atual de -200 reais.
    Given Um cliente especial com saldo atual de -200 reais
    # Quando for solicitado um saque de 100 reais.
    When for solicitado um saque no valor de 100 reais
    # Então o saque deve ser efetuado e o saldo atualizado para -300 reais.
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
    # E verificar mais resultados.
    And check more outcomes

  # Cenário: Cliente comum com saldo negativo.
  # Este cenário testa a funcionalidade de saque para um cliente comum com saldo negativo.
  @tag2
  Scenario Outline: Cliente comum com saldo negativo
    # Dado que o cliente comum tem um saldo atual de -200 reais.
    Given Um cliente comum com saldo atual de -200 reais
    # Quando for solicitado um saque de 200 reais.
    When Solicitar um saque de 200 reais
    # Então o saque não deve ser efetuado e deve retornar a mensagem "Saldo Insuficiente".
    Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
