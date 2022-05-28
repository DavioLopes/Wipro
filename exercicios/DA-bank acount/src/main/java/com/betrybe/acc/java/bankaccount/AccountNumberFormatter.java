package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String number = String.valueOf(literalAccountNumber);

    if (number.length() < 6) {
      return StringUtils.leftPad(number, 6, '0');
    }
    if (number.length() > 6) {
      return StringUtils.right(number, 6);
    }
    return number;
  }
}
