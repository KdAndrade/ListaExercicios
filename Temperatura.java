package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] nomesDosMeses = {
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    ArrayList<Double> temperaturasMensais = new ArrayList<>();
    double somaDasTemperaturas = 0.0;

    System.out.println("Digite a temperatura média de cada mês do ano:");

    for (int i = 0; i < 12; i++) {
      System.out.print("Temperatura média de " + nomesDosMeses[i] + ": ");

      while (!scanner.hasNextDouble()) {
        System.out
            .println("Entrada inválida. Por favor, digite um número (ex: 25.5 ou 25,5 dependendo do seu sistema).");
        System.out.print("Temperatura média de " + nomesDosMeses[i] + ": ");
        scanner.next();
      }

      double temperatura = scanner.nextDouble();
      temperaturasMensais.add(temperatura);
      somaDasTemperaturas += temperatura;
    }

    if (temperaturasMensais.size() != 12) {
      System.out.println("\nErro: Não foram coletadas todas as 12 temperaturas.");
    } else {

      double mediaAnual = somaDasTemperaturas / temperaturasMensais.size();
      System.out.printf("\nMédia anual das temperaturas: %.2f°C\n", mediaAnual);

      System.out.println("\nTemperaturas acima da média anual:");
      boolean encontrouAlguma = false;
      for (int i = 0; i < temperaturasMensais.size(); i++) {
        if (temperaturasMensais.get(i) > mediaAnual) {
          System.out.printf("%s: %.2f°C\n", nomesDosMeses[i], temperaturasMensais.get(i));
          encontrouAlguma = true;
        }
      }

      if (!encontrouAlguma) {
        System.out.println("Nenhuma temperatura ficou acima da média anual.");
      }
    }

    scanner.close();
  }
}