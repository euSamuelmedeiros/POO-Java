package zFormaçãoBASICA.Associaçao.Domain;

public class Funcionario {
    private String name;
    private  Departamento departamento;

    public Funcionario(String name, Departamento departamento) {
        this.departamento = departamento;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", departamento=" + departamento +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
