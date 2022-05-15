package com.trybe.acc.java;

/**
 * nullGuard.
 */
public class NullGuard {

  /**
   * printName.
   */
  public String printName(int divisor) {
    try {
      NullGenerator generator = new NullGenerator();
      String name = generator.getNome(divisor);
      return name;
    } catch (Exception e) {
      return "Nome nulo";
    }
  }
}
