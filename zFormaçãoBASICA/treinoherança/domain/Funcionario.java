package zFormaçãoBASICA.treinoherança.domain;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Funcionario {
    protected String name;
    protected int id;

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Funcionario(String name) {
        this.name = name;
        this.id = ThreadLocalRandom.current().nextInt(0,100);
    }
}
