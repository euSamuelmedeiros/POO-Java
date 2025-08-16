package Ycolecoes.Test;

import Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByidComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return Long.compare(manga1.getId(), manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(3L, "pokemom", 19.9));
        mangas.add(new Manga(1L, "hora de aventura", 9.6));
        mangas.add(new Manga(2L, "dbz", 10.10));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas, new MangaByidComparator());
        System.out.println("-------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}


// exercico para amanha:
//ecercicio sobre list comparable e lista comparator