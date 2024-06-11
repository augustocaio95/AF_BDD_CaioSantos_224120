# AF_BDD_CaioSantos_224120

  Este repositório contém um conjunto de especificações para a funcionalidade de saque em um caixa eletrônico, utilizando a linguagem Gherkin para descrever os cenários de teste. As especificações foram elaboradas para serem utilizadas em testes automatizados, garantindo o correto funcionamento da funcionalidade em diferentes cenários.

Funcionalidade: Cliente faz saque de dinheiro
Como um cliente, eu gostaria de sacar dinheiro em um caixa eletrônico, para que eu não tenha que esperar em uma fila do banco.

Cenários de Teste:
Cenário 1: Cliente especial com saldo negativo
Dado: Um cliente especial com saldo atual de -200 reais
Quando: for solicitado um saque no valor de 100 reais
Então: deve efetuar o saque e atualizar o saldo da conta para -300 reais
E: verificar mais resultados
Cenário 2: Cliente comum com saldo negativo
Dado: Um cliente comum com saldo atual de -200 reais
Quando: Solicitar um saque de 200 reais
Então: não deve efetuar o saque e deve retornar a mensagem "Saldo Insuficiente"
