package com.betrybe.acc.java.bankaccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    AccountNumberFormatter numberCont = new AccountNumberFormatter();
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Informe o n�mero da conta:");
      int number = scanner.nextInt();
      String numbeReturn = numberCont.formatAccountNumber(number);
      System.out.println("Numero da conta: " + numbeReturn);
    } catch (InputMismatchException e) {
      System.out.println("N�mero da conta inv�lido!");
    } finally {
      scanner.close();
    }
  }
}
