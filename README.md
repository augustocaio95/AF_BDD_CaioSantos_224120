# AF_BDD_CaioSantos_224120

  Imagine que você está planejando alugar um carro para uma viagem. Para facilitar esse processo, uma empresa de locação de carros desenvolveu um sistema com diferentes comportamentos, dependendo das circunstâncias da locação e do cliente.

  Inicialmente, considere um cliente que deseja alugar um carro de luxo. Se esse cliente realizar a reserva com antecedência de pelo menos uma semana, o sistema deve oferecer um desconto especial no valor total da locação. Por outro lado, suponha um cliente que necessita alugar um carro utilitário de última hora, sem qualquer reserva prévia. Nesse caso, o sistema deve ainda ser capaz de encontrar um veículo disponível e processar a locação rapidamente, mesmo que isso implique em um custo um pouco mais elevado devido à demanda urgente.

  Esses cenários exemplificam como o sistema de locação de carros responde às diferentes necessidades e condições dos clientes, adaptando-se para garantir uma experiência satisfatória de locação, seja para reservas antecipadas ou demandas de última hora.


# Feature: Locação de Carros

    Cenario: Cliente reserva um carro de luxo com antecedência
    Given que um cliente deseja alugar um carro de luxo
    And o cliente realiza uma reserva com antecedência de pelo menos uma semana
    When o cliente confirma a reserva
    When o sistema deve oferecer um desconto especial no valor total da locação

# Cenario: Cliente aluga um carro utilitário de última hora

    Given que um cliente necessita alugar um carro utilitário de última hora
    When o cliente busca por um veículo disponível sem reserva prévia
    Then o sistema deve encontrar um veículo disponível
    And o sistema deve processar a locação rapidamente
    And o sistema pode aplicar um custo um pouco mais elevado devido à demanda urgente
