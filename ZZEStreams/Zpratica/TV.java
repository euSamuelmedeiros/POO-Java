package ZZEStreams.Zpratica;

import java.util.Objects;

public class TV {
    private String name;
    private int ano;
    CategoriaTV categoriaTV;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return ano == tv.ano && Objects.equals(name, tv.name) && categoriaTV == tv.categoriaTV;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ano, categoriaTV);
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", ano=" + ano +
                ", categoriaTV=" + categoriaTV +
                '}';
    }

    public String getName() {
        return name;
    }

    public CategoriaTV getCategoriaTV() {
        return categoriaTV;
    }

    public int getAno() {
        return ano;
    }

    public TV(String name, CategoriaTV categoriaTV, int ano) {
        this.name = name;
        this.categoriaTV = categoriaTV;
        this.ano = ano;
    }
}
