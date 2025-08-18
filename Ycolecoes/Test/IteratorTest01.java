package Ycolecoes.Test;

import Ycolecoes.Domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>(); //caso for remover muitos dados das listas use o (LinkedList<>)

        mangas.add(new Manga(3L, "pokemom", 19.9, 1));
        mangas.add(new Manga(1L, "hora de aventura", 9.6, 5));
        mangas.add(new Manga(2L, "dbz", 10.10, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            Manga next = mangaIterator.next();
            if (next.getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0); // ---> progamaçao funcional (muito codigo resumido)
        System.out.println(mangas);


    }
}


//iterator --> romover dados da lista