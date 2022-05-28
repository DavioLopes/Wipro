package com.trybe.acc.java.planejamentodeviagem;

/**
 * classe voo.
 */
public class Voo {
  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   * 
   */
  public int retornarTempoVoo(double distanciaKm) {

    Double duracaoDouble = distanciaKm / 700.0;

    /* Implemente sua solução aqui */
    int duracaoInt = (int) Math.round(duracaoDouble);
    return duracaoInt;
  }

  /**
   * Método para retornar informaçao do Voo.
   * 
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {
    /* Implemente sua solução aqui */
    String info = embarque + "," + origem + "," + desembarque + "," + destino;
    return info;
  }
}
