package iniciante.src;/*
* 🚀 Desafio 2: Palíndromo

Descrição:
Crie um programa que receba uma palavra e verifique se ela é um palíndromo (se pode ser lida da mesma forma de trás para frente).

Exemplo:

"ovo" → é palíndromo.

"casa" → não é palíndromo.

Objetivo: Praticar manipulação de String e laços.
* */

import java.util.Scanner;

public class Palindromo {

  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);
    System.out.println("escreva uma palavra e descobrirei se ela é um palíndromo");
    String palavra = console.next();
    StringBuilder stringBuilder = new StringBuilder(palavra);

    if (palavra.contentEquals(stringBuilder.reverse())) {
      System.out.println("A palavra " + palavra + " é um Palíndromo");
    } else {
      System.out.println("A palavra " + palavra + " não é um palíndromo");
    }
    console.close();
  }
}
