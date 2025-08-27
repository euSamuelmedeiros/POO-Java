package zFormaçãoBASICA.Hashmap.Domain;

import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class ClienteHash {
    private  long id;
    private String name;

    public ClienteHash( String name) {
        this.id = ThreadLocalRandom.current().nextLong(0,10000);
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClienteHash{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClienteHash that = (ClienteHash) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
