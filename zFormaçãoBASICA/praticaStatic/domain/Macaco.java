package zFormaçãoBASICA.praticaStatic.domain;

public class Macaco {

    String name;
    static int quantidade;

    {
        quantidade++;
    }

    @Override
    public String toString() {
        return "Macaco{" +
                "nome='" + name + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }   

    public Macaco(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Macaco.quantidade = quantidade;
    }

}
