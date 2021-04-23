# Projeto Spring-Heroes-Api desenvolvido com spring webflux - criar um projeto de gerenciador de herois

## Ferramentas utilizadas

  - Java 8 ou superior
  - Spring webflux 
  - Dynamodb
  - Spring batch
  - Junit
  - Spring clould
  - Reactor
  - Spring mvc
  - Sl4j
  - Spring data jpa
  - Spring security



## O projeto tem como prosposta principal de gerenciar desde o cadastro de heróis até a exclusão de heróis
### Passos para executar o projeto

Primeiro deve-se entrar na pasta em que o arquivo jar do Dyanomodb está baixo, após isto para iniciar o Dynamodb executar o comando: 
java -Djava.library.path=./DynamoDBLocal_lib -jar DynamoDBLocal.jar -sharedDb. 

No último passo precisa somente subir o spring boot, o mesmo exibirá a mensagem ("Parabéns, a aplicação funcionou com sucesso !!!")

para listar as tabelas criadas: aws dynamodb list-tables --endpoint-url http://localhost:8000

documentacao gerada pela aplicação: swagger: http://localhost:8080/swagger-ui-heroes-reactive-api.html

