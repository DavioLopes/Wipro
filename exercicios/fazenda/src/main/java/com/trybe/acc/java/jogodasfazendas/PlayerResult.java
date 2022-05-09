package com.trybe.acc.java.jogodasfazendas;

/**
 * PlayerResult.
 */
public class PlayerResult {
  /**
   * playerName farms.
   */
  public PlayerResult(String playerName, Farm[] farms) {
    this.playerName = playerName;
    this.farms = farms;
  }

  private String playerName;
  private Farm[] farms;

  /**
   * calcula a area.
   */
  public double score() {
    double area = 0;
    for (Farm i : farms) {
      area += i.area();
    }
    return area;
  }
  
}
