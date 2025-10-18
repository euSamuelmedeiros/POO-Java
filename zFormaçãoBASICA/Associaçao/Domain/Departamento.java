package zFormaçãoBASICA.Associaçao.Domain;

public class Departamento {
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departamento(String name) {
        this.name = name;
    }
}
