package EblocosDeinicialização.test;

import EblocosDeinicialização.dominio.Anime;

public class Animetest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("incrivel mundo de gumball");
        for (int episodes : anime.getEpisodes()) {
            System.out.print(episodes + " ");
        }
    }

}
