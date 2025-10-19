package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduce2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00),
            new LightNovel("rapadura", 10),
            new LightNovel("Banana", 2),
            new LightNovel("Açucar", 6)

    ));

    public static void main(String[] args) {
lightNovels.stream()
        .map(LightNovel::getPrice)
        .filter(price-> price >3)
        .reduce(Double::sum)
        .ifPresent(System.out::println);

    }
}
