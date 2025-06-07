package Exercicios;

public class Vendedor {

  private double vendasBrutas;

  public Vendedor(double vendasBrutas) {
    this.vendasBrutas = vendasBrutas;
  }

  public double calcularSalario() {
    final double salarioBase = 200.0;
    final double comissao = 0.09;
    return salarioBase + (this.vendasBrutas * comissao);
  }

  public double getVendasBrutas() {
    return vendasBrutas;
  }

  public void setVendasBrutas(double vendasBrutas) {
    if (vendasBrutas >= 0) {
      this.vendasBrutas = vendasBrutas;
    }
  }
}