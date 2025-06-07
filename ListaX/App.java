package Exercicios;

public class App {

  public static void main(String[] args) {

    System.out.println("Demonstração da classe vendedor");

    Vendedor vendedor1 = new Vendedor(3000.00);
    Vendedor vendedor2 = new Vendedor(8500.50);

    System.out.printf("Salário do Vendedor 1: R$ %.2f\n", vendedor1.calcularSalario());
    System.out.printf("Salário do Vendedor 2: R$ %.2f\n", vendedor2.calcularSalario());

    System.out.println("Demonstração da classe registro climatico");

    RegistroClimatico registro2025 = new RegistroClimatico();

    registro2025.adicionarTemperatura(28.5);
    registro2025.adicionarTemperatura(29.1);
    registro2025.adicionarTemperatura(27.4);
    registro2025.adicionarTemperatura(25.0);
    registro2025.adicionarTemperatura(22.3);
    registro2025.adicionarTemperatura(21.9);
    registro2025.adicionarTemperatura(21.5);
    registro2025.adicionarTemperatura(23.8);
    registro2025.adicionarTemperatura(25.5);
    registro2025.adicionarTemperatura(26.8);
    registro2025.adicionarTemperatura(27.0);
    registro2025.adicionarTemperatura(27.9);

    registro2025.exibirTemperaturasAcimaDaMedia();
  }
}