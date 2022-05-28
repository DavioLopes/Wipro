package com.trybe.acc.java;

import java.time.LocalDate;

/**
 * SimuladorRendimento.
 */
public class SimuladorRendimento {
  /**
   * main.
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }

  /**
   * calcula os anos para o objetivo.
   */
  public int simularRendimentoAnos(double inicial, double objetivo) {
    LocalDate hoje = LocalDate.now();
    do {
      inicial += (inicial * 0.1);
      hoje = hoje.plusYears(1);
    } while (inicial <= objetivo);
    int ano = hoje.getYear();
    return ano;
  }
}
