package ZZEStreams.Zpratica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmeTest {
    public static List<Filme> filmeList = new ArrayList<>(List.of(
            new Filme("Deus nao Esta morto 2", 10, 2011),
            new Filme("velozes e furiosos", 9, 2020),
            new Filme("Alem dos olhos ", 7.5, 2023),
            new Filme("Homem aranha", 4, 2000),
            new Filme("BadBoys", 7, 1999)

    ));

    public static void main(String[] args) {

        List<String> stringList = filmeList.stream()
                .filter(fl -> fl.getAno() >= 2010)
                .filter(fl -> fl.getNota() >= 8)
                .sorted(Comparator.comparing(Filme::getAno).reversed())
                .map(Filme::getNome)
                .toList();

        System.out.println(stringList);
    }
}
