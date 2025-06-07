package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessadorDeNotas {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Double> notas = new ArrayList<>();

    System.out.println("Digite as notas. Para decimais, use VÍRGULA (ex: 8,5).");
    System.out.println("Digite -1 para encerrar.");

    while (true) {
      System.out.print("Digite uma nota: ");
      double valorLido = sc.nextDouble();

      if (valorLido == -1) {
        break;
      }

      notas.add(valorLido);
    }

    System.out.println("\nAnálise das Notas");

    int quantidadeDeValores = notas.size();
    System.out.println("Quantidade de valores lidos: " + quantidadeDeValores);

    System.out.print("Valores informados (na ordem): ");
    for (double nota : notas) {
      System.out.print(nota + " | ");
    }
    System.out.println();

    System.out.println("Valores informados (na ordem inversa):");
    for (int i = notas.size() - 1; i >= 0; i--) {
      System.out.println(notas.get(i));
    }

    double soma = 0.0;
    for (double nota : notas) {
      soma += nota;
    }

    System.out.printf("Soma dos valores: %.2f\n", soma);

    double media = 0.0;
    if (!notas.isEmpty()) {
      media = soma / quantidadeDeValores;
    }
    System.out.printf("Média dos valores: %.2f\n", media);

    int acimaDaMedia = 0;
    for (double nota : notas) {
      if (nota > media) {
        acimaDaMedia++;
      }
    }
    System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);

    int abaixoDeSete = 0;
    for (double nota : notas) {
      if (nota < 7) {
        abaixoDeSete++;
      }
    }
    System.out.println("Quantidade de valores abaixo de 7: " + abaixoDeSete);

    System.out.println("\nPrograma encerrado com sucesso!");

    sc.close();
  }
}