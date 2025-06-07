package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculoComissao {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Double> listaDeVendas = new ArrayList<>();

    System.out.println("Entrada de Vendas dos Vendedores");
    System.out.println("Digite o valor das vendas brutas de cada vendedor.");
    System.out.println("Digite -1 quando terminar.");

    while (true) {
      System.out.print("Vendas da semana: ");
      double venda = sc.nextDouble();

      if (venda == -1) {
        break;
      }

      listaDeVendas.add(venda);
    }

    int[] faixasSalariais = new int[9];

    for (double vendaBruta : listaDeVendas) {
      double salario = 200.0 + (vendaBruta * 0.09);
      int indice;

      if (salario >= 1000) {
        indice = 8;
      } else if (salario >= 200) {
        indice = (int) (salario / 100) - 2;
      } else {
        continue;
      }

      if (indice >= 0 && indice < faixasSalariais.length) {
        faixasSalariais[indice]++;
      }
    }

    System.out.println("\nRelatório de Salários");
    System.out.println("Total de vendedores em cada faixa salarial:");

    String[] rotulosFaixas = {
        "$200 - $299", "$300 - $399", "$400 - $499",
        "$500 - $599", "$600 - $699", "$700 - $799",
        "$800 - $899", "$900 - $999", "$1000 em diante"
    };

    for (int i = 0; i < faixasSalariais.length; i++) {
      System.out.printf("%-18s: %d vendedor(es)\n", rotulosFaixas[i], faixasSalariais[i]);
    }

    sc.close();
  }
}