package com.trybe.acc.java.transformatexto;

/**
 * transforma.
 */
public class Texto {

  /**
   * transforma texto.
   */
  public String transformaTexto(String palavra) {
    String replace = palavra.replace("+", " ");

    int index = palavra.indexOf("a");

    if (index % 2 == 0) {
      String upper = replace.toUpperCase();
      return upper;
    } else {
      String split = replace.split(" ")[0];
      return split;
    }
  }
}
