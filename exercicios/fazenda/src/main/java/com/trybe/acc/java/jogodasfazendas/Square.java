package com.trybe.acc.java.jogodasfazendas;

/**
 * square.
 */

public class Square implements Farm {
  /**
   * side.
   */
  public Square(double side) {
    super();
    this.side = side;
  }

  private double side;

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return Math.pow(side, 2);
  }

}
