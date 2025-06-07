package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class RegistroClimatico {

  private List<Double> temperaturas;
  private static final String[] NOMES_MESES = {
      "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
      "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
  };

  public RegistroClimatico() {
    this.temperaturas = new ArrayList<>();
  }

  public void adicionarTemperatura(double temperatura) {
    if (this.temperaturas.size() < 12) {
      this.temperaturas.add(temperatura);
    }
  }

  public double calcularMediaAnual() {
    if (temperaturas.isEmpty()) {
      return 0.0;
    }
    double soma = 0.0;
    for (double temp : this.temperaturas) {
      soma += temp;
    }
    return soma / this.temperaturas.size();
  }

  public void exibirTemperaturasAcimaDaMedia() {
    double mediaAnual = this.calcularMediaAnual();
    System.out.printf("\nTemperaturas acima da média anual (%.2f°C):\n", mediaAnual);

    boolean encontrou = false;
    for (int i = 0; i < this.temperaturas.size(); i++) {
      if (this.temperaturas.get(i) > mediaAnual) {
        System.out.printf("%s: %.2f°C\n", NOMES_MESES[i], this.temperaturas.get(i));
        encontrou = true;
      }
    }
    if (!encontrou) {
      System.out.println("Nenhuma temperatura ficou acima da média.");
    }
  }
}