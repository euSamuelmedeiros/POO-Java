package CsobrecragaDeMetodos.Dominio;

public class desenhos {
    private String type;
    private int episodes;
    private String name;
    private String genero;

    public void imprimeDesenho() {
        System.out.println(this.episodes);
        System.out.println(this.type);
        System.out.println(this.name);
        System.out.println(this.genero);
    }

    public desenhos() {
        

    }

    public void intic(String name, int episodes, String type) {
        this.type = type;
        this.episodes = episodes;
        this.name = name;

    }

    public void intic(String name, int episodes, String type, String genero) {
        intic(name, episodes, type);
        this.genero = genero;

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

}
