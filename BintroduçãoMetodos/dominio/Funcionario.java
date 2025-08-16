package BintroduçãoMetodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] wage;
    private double media;

    public void imprimee() {
        System.out.println(this.age);
        System.out.println(this.wage);
        System.out.println(this.name);

        if (wage != null) {
            for (double wages : wage) {
                System.out.print(wages + " ");
            }
        }
        wagesMedia();
    }

    public void wagesMedia() {
        if (wage == null) {
            return;
        }

        for (double wages : wage) {
            media += wages;
        }
        media = media / wage.length;
        System.out.println("\nmedia salarial " + media);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWage(double[] wage) {
        this.wage = wage;
    }

    public double[] getWage() {
        return wage;
    }

    public double getMedia() {
        return media;
    }

}