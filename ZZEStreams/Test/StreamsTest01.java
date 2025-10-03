package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Coca Cola", 4.9),
            new LightNovel("Batata", 1.9),
            new LightNovel("Arroz", 2)));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getName));
        List<String> names = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                names.add(lightNovel.getName());
            }
            if (names.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(names);


    }
}
