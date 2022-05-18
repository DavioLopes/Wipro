package com.trybe.simuladordepix;

/**
 * erroDePix.
 */
public abstract class ErroDePix extends Exception {

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
