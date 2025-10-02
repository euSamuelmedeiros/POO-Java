package ZZCLambdasTest.Service;

import ZZCLambdasTest.Domain.Anime;

public class AnimeComparetors {
    public static int coparatorbysort(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }

    public  int coparatorbysortNonStatic(Anime a1, Anime a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
