package iniciante.src;/*
* 🚀 Desafio 1: FizzBuzz Clássico

Descrição:
Escreva um programa que imprima os números de 1 a 100, mas:

Para múltiplos de 3, imprima "Fizz" no lugar do número.

Para múltiplos de 5, imprima "Buzz".

Para múltiplos de 3 e 5, imprima "FizzBuzz".

Objetivo: Praticar condicionais (if, else) e laços (for).

* */

public class FizzBuzz {

  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      int numero = i;

      if (numero % 3 == 0 && numero % 5 == 0) {
        System.out.println(numero + " FizzBuzz");
      } else if (numero % 3 == 0) {
        System.out.println(numero + " Fizz");
      } else if (numero % 5 == 0) {
        System.out.println(numero + " Buzz");
      } else {
        System.out.println(numero);
      }
    }
  }

}