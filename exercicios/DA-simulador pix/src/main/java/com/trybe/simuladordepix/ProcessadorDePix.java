package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * ProcessadorDePix.
 */
public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio sem envolver as interações
   * do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação entre o aplicativo e
   *         o servidor na nuvem. ErroValorNaoPositivo ErroChaveEmBranco.
   */
  public void executarPix(int valor, String chave)
      throws ErroDePix, IOException, ErroValorNaoPositivo, ErroChaveEmBranco {
    // TODO: Implementar.
    Conexao conection = this.servidor.abrirConexao();
    try {
      if (valor <= 0) {
        throw new ErroValorNaoPositivo();
      }
      if (chave.isBlank()) {
        throw new ErroChaveEmBranco();
      }

      String codigo = conection.enviarPix(valor, chave);

      switch (codigo) {
        case CodigosDeRetorno.SUCESSO:
          break;
        case CodigosDeRetorno.SALDO_INSUFICIENTE:
          throw new ErroSaldoInsuficiente();
        case CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA:
          throw new ErroChaveNaoEncontrada();
        default:
          throw new ErroInterno();
      }
    } finally {
      conection.close();
    }
  }

}
