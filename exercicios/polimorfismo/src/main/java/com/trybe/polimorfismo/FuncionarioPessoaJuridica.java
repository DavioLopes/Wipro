package com.trybe.polimorfismo;

public class FuncionarioPessoaJuridica extends Funcionario {
  public double calcularSalarioLiquido() {
    return this.getSalarioBruto() * 0.9;
  }
}
