package Ycolecoes.Test;

import Ycolecoes.Domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>(); // vantagens do set é que ele nao deixa usar dois elementos repetidos

        mangas.add(new Manga(3L, "pokemom", 19.9, 1));
        mangas.add(new Manga(1L, "hora de aventura", 9.6, 5));
        mangas.add(new Manga(2L, "dbz", 10.10, 0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
