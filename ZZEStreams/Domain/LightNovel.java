package ZZEStreams.Domain;

public class LightNovel {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "LightNovel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public LightNovel(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
