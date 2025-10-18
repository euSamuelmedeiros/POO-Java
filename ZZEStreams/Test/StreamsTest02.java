package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00),
            new LightNovel("rapadura", 10),
            new LightNovel("Banana", 2),
            new LightNovel("Açucar", 4.30)
    ));

    public static void main(String[] args) {
        List<String> stringList = lightNovels.stream()
                .sorted(Comparator.comparing(ln -> ln.getName()))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(ln -> ln.getName())
                .toList();


        System.out.println(stringList);
    }
}
