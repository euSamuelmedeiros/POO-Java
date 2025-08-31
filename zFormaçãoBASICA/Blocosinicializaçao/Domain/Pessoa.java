package zFormaçãoBASICA.Blocosinicializaçao.Domain;

public class Pessoa {
    private String name;

    {
        name = "Maria luiza pepeira";
        System.out.println("Ola meu nome é " + name);

    }

    public Pessoa(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                '}';
    }
}
