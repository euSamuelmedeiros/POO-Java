package ZZEStreams.Zpratica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TVtest {
    public static List<TV> tvList = new ArrayList<>(List.of(
            new TV("Velozes e furiosos", CategoriaTV.ACAO, 2010),
            new TV("Hora de aventura", CategoriaTV.DESENHO, 2016),
            new TV("Clarencio ", CategoriaTV.DESENHO, 2019),
            new TV("Gente Grande", CategoriaTV.DRAMA, 2012),
            new TV("Terremoto em sanDiego", CategoriaTV.DRAMA, 2020),
            new TV("Todo mundo em panico", CategoriaTV.ACAO, 2010)


    ));

    public static void main(String[] args) {

        Map<CategoriaTV, List<TV>> collect = tvList.stream()
                .collect(Collectors.groupingBy(TV::getCategoriaTV));
        System.out.println(collect);

        List<TV> tvList1 = tvList.stream()
                .filter(ln -> ln.getAno() >= 2010)
                .sorted(Comparator.comparing(TV::getName))
                .toList();

        System.out.println(tvList1);
    }
}
