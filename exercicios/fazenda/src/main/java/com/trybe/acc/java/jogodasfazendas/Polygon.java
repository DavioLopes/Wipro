package com.trybe.acc.java.jogodasfazendas;

/**
 * Polygon.
 */

public abstract class Polygon implements Farm {
  /**
   * construtor Polygon.
   */
  public Polygon(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }

  protected double base;
  protected double height;
}
