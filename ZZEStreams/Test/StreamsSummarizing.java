package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSummarizing {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00),
            new LightNovel("rapadura", 10),
            new LightNovel("Banana", 2),
            new LightNovel("Açucar", 4.30)
    ));

    public static void main(String[] args) {

        System.out.println((long) lightNovels.size());
        lightNovels.stream()
                .max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

        System.out.println("-----------");
        //Com collects:

        System.out.println( lightNovels.stream()
                .collect(Collectors.summarizingDouble(LightNovel::getPrice)));
    }

}