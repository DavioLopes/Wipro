package com.trybe.acc.java.sistemadevotacao;

/**
 * pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {
  protected int numero;
  protected int votos = 0;

  /**
   * nome numero.
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
  }

  public String getNome() {
    return nome;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos() {
    this.votos += 1;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
}
