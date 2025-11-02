package ZZprojetosSimples.CatalogoDeFilmes.Main;

import ZZprojetosSimples.CatalogoDeFilmes.Domain.Filme;
import ZZprojetosSimples.CatalogoDeFilmes.Domain.GeneroFilmeProjeto;
import ZZprojetosSimples.CatalogoDeFilmes.Service.CatalogoService;

public class App {
    public static void main(String[] args) {
        CatalogoService catalogo = new CatalogoService();
        catalogo.adicionarFilme(new Filme("Homem aranha", 2012, GeneroFilmeProjeto.ACAO, "Samuel", 6.7));
        catalogo.adicionarFilme( new Filme("JhonRick", 2010, GeneroFilmeProjeto.ACAO, "Gabriel", 8.0));
        catalogo.adicionarFilme(new Filme("(Nasce uma Estrela", 1018, GeneroFilmeProjeto.ROMANCE, "Maria luiza", 9.0));
        catalogo.adicionarFilme( new Filme("(À Procura da Felicidade", 2022, GeneroFilmeProjeto.DRAMA, "Miguel", 4.3));
        catalogo.adicionarFilme(new Filme("Forrest Gump", 2004, GeneroFilmeProjeto.DRAMA, "formigao", 8.2));
        catalogo.adicionarFilme(new Filme("Ilha do Medo", 2007, GeneroFilmeProjeto.DUSPENSE, "daniel", 3));
        catalogo.adicionarFilme( new Filme("O Silêncio dos Inocentes", 2013, GeneroFilmeProjeto.DUSPENSE, "Luiz felipe", 6.7));




        System.out.println("==== TODOS OS FILMES====");
        catalogo.listarTodosOSFilmes().forEach(System.out::println);

        System.out.println("\n====Filmes apos 1013====");
        catalogo.listarPorAno().forEach(System.out::println);

        System.out.println("==== ageupados por genero ====");

    }
}
