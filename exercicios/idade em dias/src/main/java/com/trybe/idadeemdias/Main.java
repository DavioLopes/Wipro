package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {

  /**
   * Class main.
   */
  public static void main(String[] args) {
    String nome;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");
    nome = scanner.next();
    System.out.println("Qual é sua idade em anos, meses e dias? ");
    System.out.println("anos:");
    String anos = scanner.next();
    System.out.println("meses:");
    String meses = scanner.next();
    System.out.println("dias:");
    String dias = scanner.next();
    int mesesInt = Integer.parseInt(meses);
    int diasInt = Integer.parseInt(dias);
    int anosInt = Integer.parseInt(anos);
    scanner.close();
    Pessoa jose = new Pessoa();

    int allDias = jose.calcularIdadeEmDias(anosInt, mesesInt, diasInt);

    System.out.println("Olá " + nome + ", sua idade em dias é " + allDias);
  }
}
