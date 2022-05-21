package com.trybe.acc.java;

/**
 * fatorial.
 */
public class Fatorial {

  /**
   * args.
   */
  public static void main(String[] args) {
    // Seu código aqui
    long f = 1;
    for (int i = 1; i <= 18; i++) {
      f = f * i;
    }

    // Imprime a saída no console. OBS: descomente a próxima linha

    System.out.println("O fatorial de 18 é igual a " + f);

  }

}
