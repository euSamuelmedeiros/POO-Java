package Ycolecoes.Domain;

import java.util.Objects;



public class Manga implements Comparable<Manga> {
    private long id;
    private String name;
    private Double preco;

    public Manga(long id, String name, Double preco) {
        Objects.requireNonNull(id, "O id nao pode ser null");
        Objects.requireNonNull(name, "O nome nao pode ser null");
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Objects.equals(name, manga.name) && Objects.equals(preco, manga.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", preco=" + preco +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Manga outroManga) {
        return Long.compare(this.id, outroManga.getId());
    }

}
