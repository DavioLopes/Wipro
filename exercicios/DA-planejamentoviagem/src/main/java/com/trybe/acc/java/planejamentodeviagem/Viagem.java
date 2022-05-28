package com.trybe.acc.java.planejamentodeviagem;

/**
 * classe viagem.
 */
public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   */
  public Viagem(String embarque, String origem, String destino, double distanciaKm) {
    /* Implemente sua solução aqui (você pode ter que alterar o construtor) */
    this.embarque = embarque;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    this.voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  /**
   * Método para retorno da duração do tempo.
   */
  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    /* Implemente sua solução aqui */
    int duracaoDoVoo = this.voo.retornarTempoVoo(this.distanciaKm);
    return duracaoDoVoo;
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    String info = this.voo.retornarInformacaoVoo(embarque, origem,
        tempoViagem.retonarDesembarqueHorarioLocalDestino(), destino);
    return info;
    /* Implemente sua solução aqui */
  }
}
