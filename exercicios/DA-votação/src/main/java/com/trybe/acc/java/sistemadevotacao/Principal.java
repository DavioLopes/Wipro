package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * classe princinpal.
 */
public class Principal {
  /**
   * main.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner input = new Scanner(System.in);
    short opcao;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcao = input.nextShort();
      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome da pessoa candidata:");
          String pcNome = input.next();
          System.out.println("Entre com o número da pessoa candidata:");
          int pcNumero = input.nextInt();
          gerenciamentoVotacao.cadastrarPessoaCandidata(pcNome, pcNumero);
          break;
        default:
          System.out.println("");
      }
    } while (opcao != 2);

    System.out.println("------------------------------");
    System.out.println("------------------------------");

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      opcao = input.nextByte();

      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome da pessoa eleitora:");
          String peNome = input.next();
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String cpfEleitor = input.next();
          gerenciamentoVotacao.cadastrarPessoaEleitora(peNome, cpfEleitor);
          break;
        default:
          System.out.println("");  
      }
    } while (opcao != 2);

    System.out.println("------------------------------");
    System.out.println("------------------------------");

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      opcao = input.nextByte();

      switch (opcao) {
        case 1:
          System.out.println("Entre com o cpf da pessoa eleitora:");
          String peCpf = input.next();
          System.out.println("Entre com o número da pessoa candidata:");
          int pcNumero = input.nextInt();
          gerenciamentoVotacao.votar(peCpf, pcNumero);
          break;
        case 2:
          break;
        default:
          System.out.println("Entre com uma opção válida");
          break;
      }
    } while (opcao != 3);
    gerenciamentoVotacao.mostrarResultado();
    input.close();
  }

}
