# Projeto de POO - Forma de Pagamento
Criação de aplicativo de console
## Descrição
Aplicação com cunho didático voltado para Programação Orientada a Objetos na linguagem java.
Trata-se de um app para pagamento onde o usuário escolhe a forma de pagamento (cartão de crédito, pix ou boleto).
- ** Base da aplicação **
    Criado uma classe abstract com os atributos (double valorPagamento e boolean statusPagamento)
    e método processarPagamento().

    Criado uma interface ValidacaoPagamento com o método validarTransacao().

- ** Formas de pagamento e regras de negócio **
    Para cada forma de pagamento foi criada uma classe que herda os atributos e métodos da classe
    abstrata e implementa a regra geral de validação da transação.

    As classes são semelhantes na construção, mas possui uma regra única para cada classe
    quanto a aplicação de taxa ou desconto, bem como a validação da transação, que ocorre de forma 
    aleatória, apenas para simular uma condição de não aceitação de um cartão de crédito, por exemplo.

    As classes de forma de pagamento são independentes podendo ser incluída novas formas de pagamento
    ou excluída, que não afetará a base da aplicação.

**Autor:**
- **Vagner Vieira Beraldo **

Aluno do 2º semestre do curso de Desenvolvimento de Sistemas do SENAC - Santo Amaro.

## Tecnologias Utilizadas
IDE utilizada para desenvolvimento: Netbeans
 
### ✔️ Linguagem de Programação JAVA
- classe abstrata
- herança e polimorfismo
- interface (para método comum as classes de forma de pagamento)
- estrutura de decisão if / switch case
- métodos


## 💻 Desenvolvedor
- [Vagner Beraldo](https://github.com/VagnerBeraldo)

### Diagrama de Classe
![Diagrama de Classe](https://github.com/VagnerBeraldo/POO-formaPagamento/blob/main/diagramaFormaPagamento.png)

