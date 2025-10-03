package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest02 {
    public static void main(String[] args) {
        List<String> list = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getName)) //sorted é para ordenar os nomes
                .filter(ln -> ln.getPrice() <= 4) // filter para filtrar, com se fosse um if
                .limit(3)                           //limit é para limitar o codigo, como se fosse um break
                .map(ln -> ln.getName())          // map é para retornar a lista
                .toList();
        System.out.println(list);

    }
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Coca Cola", 2.9),
            new LightNovel("Batata", 1.9),
            new LightNovel("Arroz", 2)));
}
