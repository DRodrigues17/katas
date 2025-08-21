package iniciante;
/*
* 🚀Desafio 5: Contagem de Vogais

Descrição:
Escreva um programa que receba uma frase e conte quantas vogais (a, e, i, o, u) existem nela.
* */

import java.util.Arrays;
import java.util.Scanner;

public class ContagemDeVogais {


  public static void main(String[] args) {

    String[] vogais = {"a","e","i","o","u"};
    int numeroDeVogais = 0;

    Scanner console = new Scanner(System.in);
    System.out.println("escreva uma palavra e descobrirei quantas vogais tem nela");
    String frase = console.nextLine();

    for (int i = 0; i < frase.length(); i++) {
      String letra = String.valueOf(frase.charAt(i));

      for (String vogal : vogais) {
        if (letra.equals(vogal)) {
          numeroDeVogais++;
        }
      }
    }
    console.close();
    System.out.println("a frase que você enviou para analise tem o total de " + numeroDeVogais + " vogais");
  }
}
