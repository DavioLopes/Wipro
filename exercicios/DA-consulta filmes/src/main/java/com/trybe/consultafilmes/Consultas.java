package com.trybe.consultafilmes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * consultas.
 */
public class Consultas {

  private final Collection<Filme> filmes;

  public Consultas(Collection<Filme> filmes) {
    this.filmes = filmes;
  }

  /**
   * Consulta 1: a partir da coleção de filmes desta classe, este método retorna o conjunto de
   * atores que interpretaram a si próprios em pelo menos um desses filmes.
   *
   * <p>
   * Considera-se "atores que interpretaram a si próprios" aqueles que têm o seu nome como uma das
   * chaves do Map `atoresPorPersonagem` e também como um dos itens pertencentes ao conjunto
   * associado a esta mesma chave.
   * </p>
   */
  public Set<String> atoresQueInterpretaramSiProprios() {
    var acthor = new TreeSet<String>();
    filmes.stream().forEach(filme -> {
      filme.atoresPorPersonagem.forEach((act, atores) -> {
        if (atores.contains(act)) {
          acthor.add(act);
        }
      });
    });
    return acthor;
  }

  /**
   * Consulta 2: a partir da coleção de filmes desta classe, este método retorna a lista de atores
   * que atuaram em pelo menos um filme de um determinado diretor. A lista retornada está disposta
   * em ordem alfabética.
   *
   * <p>
   * Considera-se que um ator tenha atuado em um filme de um determinado diretor se ele tem o seu
   * nome como um dos itens do campo `atores`, ao mesmo tempo em que o diretor em questão tem o seu
   * nome como um dos itens do campo `diretores` do mesmo filme.
   * </p>
   */
  public List<String> atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica(String diretor) {
    var acthorsForDirector = new ArrayList<String>();
    filmes.stream().forEach(filme -> {
      if (filme.diretores.contains(diretor)) {
        acthorsForDirector.addAll(filme.atores);
      }
    });
    return acthorsForDirector.stream().distinct().sorted(Comparator.comparing(name -> name))
        .collect(Collectors.toList());
  }

  /**
   * Consulta 3: a partir da coleção de filmes desta classe, este método retorna a lista de filmes
   * em que pelo menos um dos diretores tenha atuado. A lista retornada está disposta em ordem de
   * lançamento, com os filmes mais recentes no início.
   *
   * <p>
   * Considera-se "filmes em que pelo menos um dos diretores tenha atuado" aqueles em que pelo menos
   * um dos itens do campo `diretores` também é um item do campo `atores`.
   * </p>
   */
  public List<Filme> filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro() {
    var acthorAndDirector = new ArrayList<Filme>();
    filmes.stream().forEach(filme -> {
      filme.diretores.forEach((direct) -> {
        if (filme.atores.contains(direct)) {
          acthorAndDirector.add(filme);
        }
      });
    });
    return acthorAndDirector.stream().distinct()
        .sorted((fa, fb) -> Integer.compare(fb.anoDeLancamento, fa.anoDeLancamento))
        .collect(Collectors.toList());
  }

  /**
   * Consulta 4: a partir da coleção de filmes desta classe, este método retorna um Map contendo
   * todos os filmes lançados em um determinado ano agrupados por categoria.
   *
   * <p>
   * Cada chave do Map representa uma categoria, enquanto cada valor representa o conjunto de filmes
   * que se encaixam na categoria da chave correspondente.
   * </p>
   */
  public Map<String, Set<Filme>> filmesLancadosNoAnoAgrupadosPorCategoria(int ano) {
    var filmesMap = new HashMap<String, Set<Filme>>();
    var category = new ArrayList<String>();

    filmes.stream().filter(filme -> filme.anoDeLancamento == ano).forEach(filme -> {
      filme.categorias.stream().forEach(cat -> {
        category.add(cat);
      });
    });
    category.stream().forEach(cat -> {
      Set<Filme> fil = filmes.stream().filter(filme -> filme.anoDeLancamento == ano)
          .filter(filme -> filme.categorias.contains(cat)).collect(Collectors.toSet());
      filmesMap.put(cat, fil);
    });
    return filmesMap;
  }
}
