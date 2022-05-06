package com.trybe.contapoupanca;

/**
 * poupanca.
 */

public class ContaPoupanca {
  public double saldo;
  public String titularConta;

  ContaPoupanca(String nome, double saldo) {
    this.titularConta = nome;
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    saldo += valor;
  }

  public void sacar(double valor) {
    saldo -= valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}

