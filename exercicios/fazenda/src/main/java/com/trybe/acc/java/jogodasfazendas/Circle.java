package com.trybe.acc.java.jogodasfazendas;

/**
 * circle.
 */

public class Circle implements Farm {
  /**
   * radius.
   */
  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  private static final double PI = 3.14;
  private double radius;

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return PI * (radius * radius);
  }

}
