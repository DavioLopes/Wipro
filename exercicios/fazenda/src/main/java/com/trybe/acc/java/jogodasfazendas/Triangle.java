package com.trybe.acc.java.jogodasfazendas;

/**
 * Triangle.
 */

public class Triangle extends Polygon {

  public Triangle(double base, double height) {
    super(base, height);
    // TODO Auto-generated constructor stub
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return (base * height) / 2;
  }

}
