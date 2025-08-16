package zFormaçãoBASICA.Switch;

public class test {
    String name;
    Double salario;
    int idade;

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", salario=" + salario +
                ", idade=" + idade +
                '}';
    }

    public test(String name, Double salario, int idade) {
        this.name = name;
        this.salario = salario;
        this.idade = idade;
    }
}
