package com.trybe.polimorfismo;

public class FuncionarioPessoaFisica extends Funcionario {
  public double calcularSalarioLiquido() {
    return this.getSalarioBruto() * 0.8;
  }
}
