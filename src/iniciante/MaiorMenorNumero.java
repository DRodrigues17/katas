package iniciante;
/*
* 🚀 Desafio 4: Maior e Menor Número

Descrição:
Escreva um programa que leia 5 números inteiros do usuário e exiba o maior e o menor deles.
* */

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenorNumero {

  public static void main(String[] args) {

    int[] numerosRecebidos = new int[5];

    Scanner console = new Scanner(System.in);
    System.out.println("escreva 5 números, irei ordená-los e dizer qual o menor e qual o maior");
    System.out.println("escreva um número");
    numerosRecebidos[0] = console.nextInt();
    System.out.println("escreva mais um número");
    numerosRecebidos[1] = console.nextInt();
    System.out.println("escreva mais um número");
    numerosRecebidos[2] = console.nextInt();
    System.out.println("escreva mais um número");
    numerosRecebidos[3] = console.nextInt();
    System.out.println("escreva mais um número");
    numerosRecebidos[4] = console.nextInt();

    Arrays.sort(numerosRecebidos);

    System.out.println("dos números que você me passou, o menor é " + numerosRecebidos[0] + " e o maior é " +numerosRecebidos[4]);
  }

}
