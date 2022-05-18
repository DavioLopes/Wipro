package com.trybe.simuladordepix;

/**
 * ErroSaldoInsuficiente.
 */
@SuppressWarnings("serial")
public class ErroSaldoInsuficiente extends ErroDePix {

  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }
}
