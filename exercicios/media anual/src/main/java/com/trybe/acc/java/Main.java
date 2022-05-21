package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * main.
 */
public class Main {

  /**
   * notaFinal.
   */
  public static void main(String[] args) {
    // Auto-generated method stub
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Qual é o seu nome?");
    String nome = scan.next();
    System.out.println("Entre com as notas das provas:");
    System.out.println("Avaliação 1:");
    double av1 = scan.nextDouble();
    System.out.println("Avaliação 2:");
    double av2 = scan.nextDouble();
    System.out.println("Avaliação 3:");
    double av3 = scan.nextDouble();
    System.out.println("Avaliação 4:");
    double av4 = scan.nextDouble();
    Nota nota = new Nota();
    double notaF = nota.calcularMedia(av1, av2, av3, av4);
    System.out.println("Olá, " + nome + ", sua média é " + notaF);
    scan.close();
  }
}
