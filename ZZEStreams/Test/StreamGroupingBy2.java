package ZZEStreams.Test;


import ZZEStreams.Domain.Category;
import ZZEStreams.Domain.LightNovel;
import ZZEStreams.Domain.Promocao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingBy2 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00, Category.DOCE),
            new LightNovel("rapadura", 10, Category.DOCE),
            new LightNovel("Banana", 2, Category.FRUTA),
            new LightNovel("Salgadinho", 6, Category.SALGADO)
    ));

    //agrupamento por promoçao
    public static void main(String[] args) {
        Map<Promocao, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> {
                            return ln.getPrice() < 6 ? Promocao.UNDER_PROMOCAO : Promocao.NORMAL_PROMOCAO;
                        }
                ));
        System.out.println(collect);

        //agrupamento por categoria e promoção

        Map<Category, Map<Promocao, List<LightNovel>>> categoryMapMap = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promocao.UNDER_PROMOCAO : Promocao.NORMAL_PROMOCAO)));
        System.out.println("---------");
        System.out.println(categoryMapMap);
    }
}

