package PraticaOrientaçaoAObjeto.dominio;

public class MaisUm {
    private String name;

    public void imprimeSabombaAi(){
        System.out.println(this.name);
    }

    public MaisUm(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
