package ZZBcomportamento.domain;

public class Car {
    private String name = "BM";
    private String color;
    private int ano;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Car(int ano, String color) {

        this.ano = ano;
        this.color = color;
    }
}
