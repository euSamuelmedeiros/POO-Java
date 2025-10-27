package ZZEStreams.Domain;

import java.util.Objects;

public class LightNovel {
    private String name;
    private double price;
    private  Category category;



    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public LightNovel(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
