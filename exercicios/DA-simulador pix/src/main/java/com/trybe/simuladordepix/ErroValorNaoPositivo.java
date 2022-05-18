package com.trybe.simuladordepix;

/**
 * ErroValorNaoPossitivo.
 */
@SuppressWarnings("serial")
public class ErroValorNaoPositivo extends ErroDePix {

  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }
}
