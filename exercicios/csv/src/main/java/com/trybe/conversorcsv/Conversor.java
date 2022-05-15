package com.trybe.conversorcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * conversor.
 */
public class Conversor {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  /**
   * Converte todos os arquivos CSV da pasta de entradas. Os resultados são gerados na pasta de
   * saídas, deixando os arquivos originais inalterados.
   *
   * @param pastaDeEntradas Pasta contendo os arquivos CSV gerados pela página web.
   * @param pastaDeSaidas Pasta em que serão colocados os arquivos gerados no formato requerido pelo
   *        subsistema.
   *
   * @throws IOException Caso ocorra algum problema ao ler os arquivos de entrada ou gravar os
   *         arquivos de saída.
   */
  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    // TODO: Implementar.
    FileReader leitorArquivo = null;
    BufferedReader bufferedLeitor = null;
    FileWriter escritorArquivo = null;
    BufferedWriter bufferedEscritor = null;
    pastaDeSaidas.mkdir();

    try {
      for (File file : pastaDeEntradas.listFiles()) {
        leitorArquivo = new FileReader(file);
        bufferedLeitor = new BufferedReader(leitorArquivo);
        String fileName = file.getName();
        String caminhoSalvar = pastaDeSaidas.getPath() + "/" + fileName;
        File newFile = new File(caminhoSalvar);
        newFile.createNewFile();
        escritorArquivo = new FileWriter(newFile);
        bufferedEscritor = new BufferedWriter(escritorArquivo);
        String line = bufferedLeitor.readLine();
        bufferedEscritor.write(line);
        bufferedEscritor.flush();

        boolean jumpFirstLine = false;

        while (line != null) {
          if (jumpFirstLine) {
            String[] infos = line.split(",");
            String name = infos[0].toUpperCase();
            String date = dataShape(infos[1]);
            String email = infos[2];
            String cpf = cpfShape(infos[3]);
            String allInfos = name + "," + date + "," + email + "," + cpf;
            bufferedEscritor.newLine();
            bufferedEscritor.write(allInfos);
            bufferedEscritor.flush();
          }
          line = bufferedLeitor.readLine();
          jumpFirstLine = true;
        }

      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      this.fecharObjetos(leitorArquivo, bufferedLeitor, escritorArquivo, bufferedEscritor);
    }
  }

  private void fecharObjetos(FileReader fileReader, BufferedReader bufferedReader,
      FileWriter fileWriter, BufferedWriter bufferedWriter) {
    try {
      fileReader.close();
      bufferedReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * data.
   */
  private String dataShape(String data) {
    String[] shape = data.split("/");
    String dateFormated = shape[2] + "-" + shape[1] + "-" + shape[0];
    return dateFormated;
  }

  /**
   * cpf.
   */
  private String cpfShape(String cpf) {
    String pt1 = cpf.substring(0, 3);
    String pt2 = cpf.substring(3, 6);
    String pt3 = cpf.substring(6, 9);
    String pt4 = cpf.substring(9, 11);
    String cpfShape = pt1 + '.' + pt2 + '.' + pt3 + '-' + pt4;
    return cpfShape;
  }
}
