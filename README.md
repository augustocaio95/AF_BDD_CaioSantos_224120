# AF_BDD_CaioSantos_224120

Feature: Locação de Carros

  Scenario: Cliente reserva um carro de luxo com antecedência
    Given que um cliente deseja alugar um carro de luxo
    And o cliente realiza uma reserva com antecedência de pelo menos uma semana
    When o cliente confirma a reserva
    Then o sistema deve oferecer um desconto especial no valor total da locação

  Scenario: Cliente aluga um carro utilitário de última hora
    Given que um cliente necessita alugar um carro utilitário de última hora
    When o cliente busca por um veículo disponível sem reserva prévia
    Then o sistema deve encontrar um veículo disponível
    And o sistema deve processar a locação rapidamente
    And o sistema pode aplicar um custo um pouco mais elevado devido à demanda urgente
