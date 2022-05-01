package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    // Seu código aqui
    int tentativas = 1;
    boolean conectou;
    do {
      conectou = conectou();
      if (conectou) {
        System.out.println("conectado a internet na: " + tentativas);
      } else {
        System.out.println("nao conectado, tentativa: " + tentativas);
      }
      tentativas++;
    } while (tentativas <= 3 && !conectou);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }
}
