package Ycolecoes.Test;

import Ycolecoes.Domain.Manga;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas  = new TreeSet<>();
        mangas.add(new Manga(3L, "pokemom", 19.9, 8));
        mangas.add(new Manga(1L, "hora de aventura", 9.6, 3));
        mangas.add(new Manga(2L, "dbz", 10.10,10));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
