package Ycolecoes.Test;

import Ycolecoes.Domain.Consumidor;
import Ycolecoes.Domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Samuel");
        Consumidor consumidor2 = new Consumidor("Pedro");

        Manga manga1 = new Manga(3L, "pokemom", 19.9);
        Manga manga2 = new Manga(1L, "hora de aventura", 9.6);
        Manga manga3 = new Manga(2L, "dbz", 10.10);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga3);
        consumidorManga.put(consumidor2, manga1);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getName() + " = " + entry.getValue().getName());
        }




    }
}
