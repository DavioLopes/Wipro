package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

/**
 * AnoBissexto.
 */
public class AnoBissexto {
  /**
   * identificarAnoBissexto.
   */
  public boolean identificarAnoBissexto(int ano) {
    return Year.isLeap(ano);
  }

  /**
   * identificarProximoAnoBissexto.
   */
  public int identificarProximoAnoBissexto(String data) {
    LocalDate year = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    do {
      year = year.plusYears(1);
    } while (!year.isLeapYear());
    return year.getYear();
  }
}
