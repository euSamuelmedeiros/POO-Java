package ZZEStreams.Zpratica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LivroTest {
    public static List<Livro> livroList = new ArrayList<>(List.of(
            new Livro("Bananas de pijama", 10, 3),
            new Livro("attack on titan", 4.9, 2.4),
            new Livro("Deus nao esta morto", 15, 5),
            new Livro("Java avançado", 2, 4)
    ));

    public static void main(String[] args) {

        List<Livro> livroList1 = livroList.stream()
                .filter(lv -> lv.getAssessment() >= 4)
                .sorted(Comparator.comparing(lv -> lv.getTitle()))
                .limit(5)
                .toList();

        System.out.println(livroList1);


    }
}
