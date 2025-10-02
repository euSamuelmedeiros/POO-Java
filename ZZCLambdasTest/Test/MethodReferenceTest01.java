package ZZCLambdasTest.Test;

import ZZCLambdasTest.Domain.Anime;
import ZZCLambdasTest.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Method Reference com lambda e metodo static
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList =  new ArrayList<>(List.of(new Anime("Pokemom", 10), new Anime("Berserk", 33)));
//        Collections.sort(animeList, (a1,a2) -> a1.getName().compareTo(a2.getName()));
        Collections.sort(animeList, AnimeComparetors::coparatorbysort);
        System.out.println(animeList);
    }
}
