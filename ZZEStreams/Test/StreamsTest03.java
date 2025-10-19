package ZZEStreams.Test;

import ZZEStreams.Domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamsTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Paçoca", 5.00),
            new LightNovel("rapadura", 10),
            new LightNovel("Banana", 2),
            new LightNovel("Açucar", 6)
    ));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 5));     //anyMatch -> BUSCAR
        System.out.println(lightNovels.stream().allMatch(ln-> ln.getPrice() > 0));      //AllMatch -> VERIFICAR

        lightNovels.stream()
                .filter(ln-> ln.getPrice() >3)
                .findAny()        //  -> escolhe algum elemento da listas aleatoriamente q se adequa aos requisitos
                .ifPresent(System.out::println);        //ifpresent ->  so executa o codigo se o valor estiver presente
    }
}
