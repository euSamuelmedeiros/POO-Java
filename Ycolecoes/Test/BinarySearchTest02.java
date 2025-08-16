package Ycolecoes.Test;

import Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(3L, "pokemom", 19.9));
        mangas.add(new Manga(1L, "hora de aventura", 9.6));
        mangas.add(new Manga(2L, "dbz", 10.10));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaTosearch = new Manga(2L, "dbz", 10.10);
        System.out.println(Collections.binarySearch(mangas, mangaTosearch));
    }
}
