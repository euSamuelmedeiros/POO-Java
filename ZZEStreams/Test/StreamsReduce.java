package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsReduce {
    public static void main(String[] args) {
       lightNovels.stream()
               .map(LightNovel::getPrice)
               .filter(price -> price > 3)
               .reduce(Double::sum)
               .ifPresent(System.out::println);

    }
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Coca Cola", 4.9),
            new LightNovel("Batata", 1.9),
            new LightNovel("Arroz", 2)));



}