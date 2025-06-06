package Exercicios;

import java.util.Scanner;

public class Crime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] perguntas = {
        "Você telefonou para a vítima?",
        "Você esteve no local do crime?",
        "Você mora perto da vítima?",
        "Você devia para a vítima?",
        "Você já trabalhou com a vítima?"
    };

    boolean[] respostas = new boolean[perguntas.length];
    int contadorDeSim = 0;

    System.out.println("Responda apenas com Sim ou Não.");

    for (int i = 0; i < perguntas.length; i++) {
      System.out.println(perguntas[i]);
      respostas[i] = sc.nextLine().equalsIgnoreCase("Sim");
    }

    for (boolean resposta : respostas) {
      if (resposta) {
        contadorDeSim++;
      }
    }

    System.out.println("\nClassificação Final ");
    if (contadorDeSim == 5) {
      System.out.println("Pessoa Classificada como: Assassino(a)");
    } else if (contadorDeSim >= 3) {
      System.out.println("Pessoa Classificada como: Cúmplice");
    } else if (contadorDeSim == 2) {
      System.out.println("Pessoa Classificada como: Suspeita");
    } else {
      System.out.println("Pessoa Classificada como: Inocente");
    }

    sc.close();
  }
}