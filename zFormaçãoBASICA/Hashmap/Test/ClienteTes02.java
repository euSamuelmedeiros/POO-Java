package zFormaçãoBASICA.Hashmap.Test;

import Ycolecoes.Domain.Manga;
import zFormaçãoBASICA.Hashmap.Domain.ClienteHash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteTes02 {
    public static void main(String[] args) {
        ClienteHash clienteHash1 = new ClienteHash("Samuel");
        ClienteHash clienteHash2 = new ClienteHash("Luiz Felipe");

        Manga manga1 = new Manga(3L, "pokemom", 19.9);
        Manga manga2 = new Manga(1L, "hora de aventura", 9.6);
        Manga manga3 = new Manga(7L, "dbz", 10.10);
        Manga manga4 = new Manga(9L, "gumball", 8.0);
        Manga manga5 = new Manga(2L, "Simpsons", 4.5);

        Map<ClienteHash, List<Manga>> consumidorMangaMap = new HashMap<>();     //praticando hashMap
        List<Manga> mangaConsumidorLIst01 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidorLIst02 = List.of(manga4, manga5);

        consumidorMangaMap.put(clienteHash1, mangaConsumidorLIst01);
        consumidorMangaMap.put(clienteHash2, mangaConsumidorLIst02);

        for (Map.Entry<ClienteHash, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("-" + entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("----" + manga.getName());

            }

        }


    }
}

