package FmodificadorEtatico.dominio;

public class Anime {
    private String name;
    private static int[] episodes;

    static {
        System.out.println("inside the block");
        episodes = new int[10];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodes : Anime.episodes) {
            System.out.print(episodes + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
