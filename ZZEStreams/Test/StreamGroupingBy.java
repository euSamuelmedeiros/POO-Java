package ZZEStreams.Test;

import ZZEStreams.Domain.Category;
import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00, Category.DOCE),
            new LightNovel("rapadura", 10, Category.DOCE),
            new LightNovel("Banana", 2, Category.FRUTA),
            new LightNovel("Salgadinho", 6, Category.SALGADO)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> listMap = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.print(lightNovels);
    }
}
