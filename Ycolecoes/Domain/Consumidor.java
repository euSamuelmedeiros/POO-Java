package Ycolecoes.Domain;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {

    private long id;
    private String name;

    public Consumidor( String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,100_000);
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Consumidor that = (Consumidor) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Consumidor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

    }

    public String getName() {
        return name;
    }
}
