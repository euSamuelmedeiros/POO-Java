package ZZCLambdasTest.Test;

import ZZCLambdasTest.Domain.Anime;
import ZZCLambdasTest.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.List;

// Method Reference fazendo referencia para construtores
public class MethodReferenceByconstrutor {
    public static void main(String[] args) {
        AnimeComparetors animeComparetors = new AnimeComparetors();
        List<Anime> animeList =  new ArrayList<>(List.of(new Anime("Pokemom", 10), new Anime("Berserk", 33)));
        animeList.sort(animeComparetors::coparatorbysortNonStatic);
        System.out.println(animeList);
    }
}
