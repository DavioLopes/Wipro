package com.trybe.acc.java.numerospares;

/**
 * Class NumerosPares.
 *
 */
public class NumerosPares {

  /**
   * imprime numeros pares.
   */
  public static void main(String[] args) {
    for (int i = 4; i <= 20; i++) {
      if (i % 2 == 0) {
        imprime(i);
      }
    }
  }

  /**
   * Método para imprimir no console os números de 4 a 20.
   *
   */
  public static void imprime(int numero) {
    System.out.println(numero);
  }
}
