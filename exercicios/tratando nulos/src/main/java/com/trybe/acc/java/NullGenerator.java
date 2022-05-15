package com.trybe.acc.java;

/**
 * nullGenerator.
 */
public class NullGenerator {

  /**
   * getNpme.
   */
  public String getNome(int i) {
    if (i % 2 == 0) {
      return "BOB";
    }
    throw new NullPointerException();
  }
}
