package com.trybe.acc.java.sistemadevotacao;

/**
 * classe Pessoa.
 */
public abstract class Pessoa {

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  protected String nome;
}
