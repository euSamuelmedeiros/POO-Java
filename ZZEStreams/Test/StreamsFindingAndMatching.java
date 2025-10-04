package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsFindingAndMatching {
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));

    }
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Coca Cola", 4.9),
            new LightNovel("Batata", 1.9),
            new LightNovel("Arroz", 2)));
}
