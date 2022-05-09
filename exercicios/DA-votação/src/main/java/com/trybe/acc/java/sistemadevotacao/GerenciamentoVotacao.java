package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * Gerencia a votação.
 */
public class GerenciamentoVotacao {
  private ArrayList<PessoaCandidata> candidatos = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> eleitores = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfEleitor = new ArrayList<String>();
  private int totalVotos = 0;

  /**
   * pcNome pcNumero.
   */
  public void cadastrarPessoaCandidata(String pcNome, int pcNumero) {
    for (PessoaCandidata pc : candidatos) {
      if (pc.getNumero() == pcNumero) {
        System.out.println("Número pessoa candidata já utilizado!");
      }
    }
    candidatos.add(new PessoaCandidata(pcNome, pcNumero));
  }

  /**
   * peNome cpfCandidato.
   */
  public void cadastrarPessoaEleitora(String peNome, String cpfEleitor) {
    for (PessoaEleitora pel : eleitores) {
      if (pel.getCpf().equals(cpfEleitor)) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
    eleitores.add(new PessoaEleitora(peNome, cpfEleitor));
  }

  /**
   * peCpf pcNumero.
   */
  public void votar(String peCpf, int pcNumero) {
    boolean votou = false;
    for (String cpf : cpfEleitor) {
      if (cpf.equals(peCpf)) {
        votou = true;
      }
    }
    if (votou) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (PessoaCandidata j : candidatos) {
        if (j.getNumero() == pcNumero) {
          j.setVotos();
        }
      }
      cpfEleitor.add(peCpf);
      this.totalVotos += 1;
    }
  }

  /**
   * mostra o resultado da eleição.
   */
  public void mostrarResultado() {
    if (this.totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    for (PessoaCandidata i : candidatos) {
      double percent = Math.round(100 * i.getVotos() / this.totalVotos);
      System.out
          .println("Nome: " + i.getNome() + " - " + i.getVotos() + " votos ( " + percent + "% )");
    }
    System.out.println("Total de votos: " + this.totalVotos);
  }

}
