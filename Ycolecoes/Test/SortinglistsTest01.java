package Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortinglistsTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("pokemon");
        mangas.add("hora de aventura");
        mangas.add("dbz");
        Collections.sort(mangas);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-------------------");

        List<Double> dindin  = new ArrayList<>(10);
        dindin.add(20D);
        dindin.add(3.5);
        dindin.add(17.1);
        dindin.add(30.4);
        dindin.add(21.9);

        Collections.sort(dindin); // Colletions.sort ordena os dados por ordem de tamanho.

        for (Double dinheiro: dindin){
            System.out.println(dinheiro);
        }
    }

}
