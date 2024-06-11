# AF_BDD_CaioSantos_224120

Este repositório contém um conjunto de especificações para a funcionalidade de saque em um caixa eletrônico, utilizando a linguagem Gherkin para descrever os cenários de teste. As especificações foram elaboradas para serem utilizadas em testes automatizados, garantindo o correto funcionamento da funcionalidade em diferentes cenários.

# Funcionalidade: Cliente faz saque de dinheiro
Como um cliente, eu gostaria de sacar dinheiro em um caixa eletrônico, para que eu não tenha que esperar em uma fila do banco.

    Scenario: Cliente especial com saldo negativo
    Given Um cliente especial com saldo atual de -200 reais
    When for solicitado um saque no valor de 100 reais
    Then deve efetuar o saque e atualizar o saldo da conta para -300 reais
    And check more outcomes
    
# Cenário 2: Cliente comum com saldo negativo
    Scenario Outline: Cliente comum com saldo negativo
    Given Um cliente comum com saldo atual de -200 reais
    When Solicitar um saque de 200 reais
    Then não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente
# Primeiros resultados testando a classe "arquivos_teste.feature"

![image](https://github.com/augustocaio95/AF_BDD_CaioSantos_224120/assets/124223509/28e8a964-cb7a-4c17-a454-c7b8c374ba07)

# Segundo resultado testando a classe "Conta" com o que foi recomendado pelo cucumber

![image](https://github.com/augustocaio95/AF_BDD_CaioSantos_224120/assets/124223509/4cfebd73-2308-4d8e-b14e-c5e826eb7403)
