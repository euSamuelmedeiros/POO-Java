package EblocosDeinicialização.dominio;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("inside the block");
          episodes = new int[50];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
 }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

        for (int episodes : this.episodes) {
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
