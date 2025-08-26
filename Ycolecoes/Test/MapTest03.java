package Ycolecoes.Test;

import Ycolecoes.Domain.Consumidor;
import Ycolecoes.Domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Samuel");
        Consumidor consumidor2 = new Consumidor("Pedro");

        Manga manga1 = new Manga(3L, "pokemom", 19.9);
        Manga manga2 = new Manga(1L, "hora de aventura", 9.6);
        Manga manga3 = new Manga(7L, "dbz", 10.10);
        Manga manga4 = new Manga(9L, "gumball", 8.0);
        Manga manga5 = new Manga(2L, "Simpsons", 4.5);

        List<Manga> mangaConsumidorList1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorList2 = List.of(manga5, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1, mangaConsumidorList1);
        consumidorMangaMap.put(consumidor2, mangaConsumidorList2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("_____-" + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("------------" + manga.getName());
            }

        }


    }
}
