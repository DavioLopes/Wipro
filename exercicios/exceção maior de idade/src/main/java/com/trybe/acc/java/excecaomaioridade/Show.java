package com.trybe.acc.java.excecaomaioridade;

/**
 * Classe do desafio.
 */
public class Show {

  /**
   * Método do desafio.
   */
  public boolean permitirEntrada(int idade) throws PessoaMenorDeIdadeException {
    if (idade < 18) {
      throw new PessoaMenorDeIdadeException();
    }
    return false;
  }

  /**
   * menor de idade erro.
   */
  public class PessoaMenorDeIdadeException extends Exception {
    public PessoaMenorDeIdadeException() {
      super("Pessoa menor de 18 anos! Operação não permitida");
    }
  }
}
