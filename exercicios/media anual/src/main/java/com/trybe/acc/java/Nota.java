package com.trybe.acc.java;

/**
 * calcula a media das notas.
 */
public class Nota {
  public double calcularMedia(double av1, double av2, double av3, double av4) {
    double notaFinal = (av1 + av2 + av3 + av4) / 4;
    return notaFinal;
  }
}

