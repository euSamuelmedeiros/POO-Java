package BintroduçãoMetodos.dominio;

public class Pessoa {
    private String name;
    private int age; // private, so quem esta no onjeto tem acesso ao dado
    private int wage;
    private String address;

    public void imprime() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(this.wage);
        System.out.println(this.address);
    }

    public void setName(String name) {
        if (name == " ") {
            System.out.println("There is still missing data, please complete it correctly");
            return;
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age.");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
