package com.trybe.acc.java.sistemadevotacao;

/**
 * classe eleitor.
 */
public class PessoaEleitora extends Pessoa {
  protected String cpf;

  /**
   * nome cpf.
   */
  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
