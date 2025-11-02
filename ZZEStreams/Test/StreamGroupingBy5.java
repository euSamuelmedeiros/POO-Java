package ZZEStreams.Test;


import ZZEStreams.Domain.Promocao;
import ZZEStreams.Zpratica.CategoriaTV;
import ZZEStreams.Zpratica.TV;

import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingBy5 {
    public static List<TV> tvList = new ArrayList<>(List.of(
            new TV("Velozes e furiosos", CategoriaTV.ACAO, 2010),
            new TV("Hora de aventura", CategoriaTV.DESENHO, 2016),
            new TV("Clarencio ", CategoriaTV.DESENHO, 2019),
            new TV("Gente Grande", CategoriaTV.DRAMA, 2012),
            new TV("Terremoto em sanDiego", CategoriaTV.DRAMA, 2020),
            new TV("Todo mundo em panico", CategoriaTV.ACAO, 2010)


    ));

    public static void main(String[] args) {
        Map<CategoriaTV, DoubleSummaryStatistics> collect
                = tvList.stream().collect(Collectors.groupingBy(TV::getCategoriaTV, Collectors.summarizingDouble(TV::getAno)));
        System.out.println(collect);
        System.out.println("----------");

        Map<CategoriaTV, Set<Promocao>> tvMapMap = tvList.stream()
                .collect(Collectors.groupingBy(TV::getCategoriaTV, Collectors.mapping(StreamGroupingBy5::getPromocao, Collectors.toSet())));

        System.out.println(tvMapMap);

    }
    private static Promocao getPromocao(TV tv){
       return tv.getAno() >= 1016 ? Promocao.NEW_DESING : Promocao.ANTIQUE_DESING;
    }
}



