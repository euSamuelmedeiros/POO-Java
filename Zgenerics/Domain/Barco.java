package Zgenerics.Domain;

public class Barco {

    private String name;


    @Override
    public String
    toString() {
        return "Barco{" +
                "name='" + name + '\'' +
                '}';
    }

    public Barco(String name) {
        this.name = name;
    }
}
