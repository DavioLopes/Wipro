package com.trybe.acc.java;

import java.util.ArrayList;
import java.util.List;

/**
 * agenda.
 */
public class Agenda {


  private List<String> contatos = new ArrayList<>();

  public void incluirContato(String nome) {
    contatos.add(nome);
  }

  public void excluirContato(String nome) {
    contatos.remove(nome);
  }

  boolean verificaContato(String nome) {
    return contatos.contains(nome);
  }

  int tamanhoAgenda() {
    return contatos.size();
  }
}
