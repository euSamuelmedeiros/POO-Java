package TreinoQualquer.dominio;

public class Funcionario {
    private String name;
    private Cargo cargo;


    @Override
    public String toString() {
        return "Funcionario [name=" + name + ", cargo=" + cargo + "]";
    }

    public Funcionario(String name, Cargo cargo) {
        this.name = name;
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
