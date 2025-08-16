package zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain;

public class design {
    String name;
    String tipo;
    int episodes;

    public design() {

    }

    public design(String name) {
        this.name = name;
    }

    public design(String name, String tipo) {
        this.name = name;
        this.tipo = tipo;

    }

    public design(String name, String tipo, int episodes) {
        this.name = name;
        this.tipo = tipo;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "design [name=" + name + ", tipo=" + tipo + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
