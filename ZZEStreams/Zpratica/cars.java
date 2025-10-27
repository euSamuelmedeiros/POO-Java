package ZZEStreams.Zpratica;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class cars {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Fuscao", 40),
            new LightNovel("Corolla", 20),
            new LightNovel("BMW", 70),
            new LightNovel("Audi A5", 90)
    ));
    public static void main(String[] args) {
        List<LightNovel> lightNovels1 = lightNovels.stream()
                .filter(ln -> ln.getPrice() >= 50)
                .sorted(Comparator.comparing(ln -> ln.getName()))
                .limit(100)
                .toList();

        System.out.println(lightNovels1);


    }
}
