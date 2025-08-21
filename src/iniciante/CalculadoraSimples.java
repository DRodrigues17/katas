package iniciante;
/*
* 🚀Desafio 3: Calculadora Simples

Descrição:
Faça um programa que leia dois números inteiros e uma operação (+, -, *, /) e retorne o resultado.

Exemplo de entrada/saída:

Entrada: 5 3 +
Saída: 8


Objetivo: Treinar entrada de dados, condicionais e operações matemáticas.
* */

import java.util.Scanner;

public class CalculadoraSimples {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    System.out.println("escreva um numero");
    double primeiroNumero = console.nextDouble();
    System.out.println("escreva mais um numero");
    double segundoNumero = console.nextDouble();
    System.out.println("agora vou passar as 4 operações que computamos, segue abaixo e depois você escolhe uma e vemos o resultado da operação");
    System.out.println("+ simbolizando adição");
    System.out.println("- simbolizando subtração");
    System.out.println("* simbolizando multiplicação");
    System.out.println("/ simbolizando divisão");
    System.out.println("agora escolha a operação");
    String simboloOperacao = console.next();

    switch (simboloOperacao) {
      case "+" -> {
        double resultadoSoma = primeiroNumero + segundoNumero;
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultadoSoma);
      }
      case "*" -> {
        double resultadoMultiplicacao = primeiroNumero * segundoNumero;
        System.out.println(primeiroNumero + " x " + segundoNumero + " = " + resultadoMultiplicacao);
      }
      case "-" -> {
        double resultadoSubtracao = primeiroNumero - segundoNumero;
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoSubtracao);
      }
      case "/" -> {
        double resultadoDivisao = primeiroNumero / segundoNumero;
        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultadoDivisao);
      }
    }

    console.close();
  }

}
