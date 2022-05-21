package com.trybe.agenda;

import java.util.HashMap;

public class AgendaMapa {
  private HashMap<String, String> contatos = new HashMap<String, String>();

  public void incluirContato(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    contatos.remove(nome);
  }

  boolean verificaContato(String nome) {
    return contatos.containsKey(nome);
  }

  int tamanhoAgenda() {
    return contatos.size();
  }

  void atualizarTelefone(String nome, String telefone) {
    contatos.put(nome, telefone);
  }

  String obterTelefone(String nome) {
    return contatos.get(nome);
  }
}
