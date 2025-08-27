package zFormaçãoBASICA.Hashmap.Test;

import Ycolecoes.Domain.Manga;
import zFormaçãoBASICA.Hashmap.Domain.ClienteHash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteTes01 {
    public static void main(String[] args) {
        ClienteHash clienteHash1 = new ClienteHash("Samuel");
        ClienteHash clienteHash2 = new ClienteHash("Luiz Felipe");

        Manga manga1 = new Manga(3L, "pokemom", 19.9);
        Manga manga2 = new Manga(1L, "hora de aventura", 9.6);
        Manga manga3 = new Manga(7L, "dbz", 10.10);
        Manga manga4 = new Manga(9L, "gumball", 8.0);
        Manga manga5 = new Manga(2L, "Simpsons", 4.5);

        List<Manga> mangaconsumudorMap1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaconsumudorMap2 = List.of(manga4, manga5);
        Map<ClienteHash, List<Manga>> clienteHashListMap = new HashMap<>();

        clienteHashListMap.put(clienteHash1, mangaconsumudorMap1);
        clienteHashListMap.put(clienteHash2, mangaconsumudorMap2);

        for (Map.Entry<ClienteHash, List<Manga>> entry : clienteHashListMap.entrySet()) {
            System.out.println("-"+entry.getKey().getName());
            for (Manga manga : entry.getValue()) {
                System.out.println("---------"+manga.getName());
            }

        }
    }
}
