package ZZCLambdasTest.Test;

import ZZCLambdasTest.Domain.Anime;
import ZZCLambdasTest.Service.AnimeComparetors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  Method Reference com criação de objeto nao static
public class MethodReferenceNaoStaticoTest01 {
    public static void main(String[] args) {
        AnimeComparetors animeComparetors = new AnimeComparetors();
        List<Anime> animeList =  new ArrayList<>(List.of(new Anime("Pokemom", 10), new Anime("Berserk", 33)));
        Collections.sort(animeList, animeComparetors::coparatorbysortNonStatic);
        System.out.println(animeList);
    }
}
