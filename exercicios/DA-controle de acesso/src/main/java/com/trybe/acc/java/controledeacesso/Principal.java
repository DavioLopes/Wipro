package com.trybe.acc.java.controledeacesso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * metodo princinpal.
 */
public class Principal {
  static ArrayList<Integer> allPeople = new ArrayList<Integer>();
  static int quantChil = 0;
  static int quantAdul = 0;
  static int quantOlde = 0;

  /**
   * menu.
   */
  public static void menu() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    System.out.println("1 - Acessar o estabelecimento");
    System.out.println("2 - Finalizar sistema e mostrar relatório");
  }

  /**
   * menu quantidade.
   */
  public static void quantity() {
    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + quantChil);
    System.out.println("adultas: " + quantAdul);
    System.out.println("a partir de 50: " + quantOlde + "\n");
  }

  public static void percenty() {
    float allChild = (float) (quantChil * 100) / (float) allPeople.size();
    float allAdul = (float) (quantAdul * 100) / (float) allPeople.size();
    float allOld = (float) (quantOlde * 100) / (float) allPeople.size();

    DecimalFormat shap = new DecimalFormat("#0.00");

    String percentChil = shap.format(allChild);
    String percentAdul = shap.format(allAdul);
    String percentOld = shap.format(allOld);


    System.out.println("----- Percentual -----");
    System.out.println("menores: " + percentChil + "%");
    System.out.println("adultas: " + percentAdul + "%");
    System.out.println("a partir de 50: " + percentOld + "%" + "\n");
    System.out.println("TOTAL: " + allPeople.size());
  }

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Scanner entrada = new Scanner(System.in);
    short opcao = 0;
    do {
      menu();
      opcao = entrada.nextShort();

      switch (opcao) {
        case 1:
          int age = 0;
          System.out.println("Entre com a sua idade:");
          age = entrada.nextInt();
          allPeople.add(age);

          if (age < 18) {
            System.out.println("Pessoa cliente menor de idade, catraca liberada!");
            quantChil++;
          }
          if (age <= 49 && age >= 18) {
            System.out.println("Pessoa adulta, catraca liberada!");
            quantAdul++;
          }
          if (age >= 50) {
            System.out.println("Pessoa adulta a partir de 50, catraca liberada!");
            quantOlde++;
          }
          break;

        case 2:
          quantity();
          percenty();
          break;
        default:
          System.out.println("Entre com uma opção válida");
          break;
      }
    } while (opcao != 2);

    entrada.close();
  }
}
