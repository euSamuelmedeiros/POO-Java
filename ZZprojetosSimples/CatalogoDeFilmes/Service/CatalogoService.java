package ZZprojetosSimples.CatalogoDeFilmes.Service;

import ZZEStreams.Zpratica.TV;
import ZZprojetosSimples.CatalogoDeFilmes.Domain.Filme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CatalogoService {
    private List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> listarTodosOSFilmes() {
        return filmes;
    }

    public List<Filme> listarPorAno() {
        return filmes.stream()
                .filter(f -> f.getAno() >= 2013)
                .collect(Collectors.toList());
    }


    public Map<String, List<Filme>> agruparPorTitulo() {
        return filmes.stream()
                .collect(Collectors.groupingBy(Filme::getTitulo));
    }


    public List<Filme> agruparPorAnoDecrescente() {
        return filmes.stream()
                .sorted(Comparator.comparing(Filme::getAno).reversed())
                .collect(Collectors.toList());
    }

    public List<Filme> filtrarPorGenero() {
        return filmes.stream()
                .sorted(Comparator.comparing(Filme::getNota).reversed())
                .collect(Collectors.toList());


    }
}
