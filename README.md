# DIO - DESAFIO BANCO TERMINAL

Resolu��o do desafio proposto no bootcamp da claro.

- conhecer e importar a classe Scanner
- Exibir as mensagens para o nosso usu�rio
- Obter pela scanner os valores digitados no terminal
- Exibir a mensagem da conta criada






# DIO - Trilha Java B�sico - DESCRI��O DO DESAFIO
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Sintaxe - Desafio

Vamos exercitar todo o conte�do apresentado no m�dulo de Sintaxe codificando o seguinte cen�rio.

1. Crie o projeto `ContaBanco` que receber� dados via terminal contendo as caracter�sticas de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codifica��o do nosso programa.

###### Revise sobre regras de declara��o de vari�veis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usu�rio receber� a mensagem de qual informa��o ser� solicitada, exemplo:

* Programa: "Por favor, digite o n�mero da Ag�ncia !"
* Usu�rio: 1021 *(depois ENTER para o pr�ximo campo)* 

###### Revise sobre concatena��o e classe String com m�todo concat

3. Depois de todas as informa��es terem sido inseridas, o sistema dever� exibir a seguinte mensagem:

*"Ol� [Nome Cliente], obrigado por criar uma conta em nosso banco, sua ag�ncia � [Agencia], conta [Numero] e seu saldo [Saldo] j� est� dispon�vel para saque".*

Os campos em [ ] devem ser alterados pelas informa��es que forem inseridas pelos usu�rios.