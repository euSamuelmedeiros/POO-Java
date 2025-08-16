package treinoherança.domain;

public class Pessoa {
    private String name;
    private int age;

    public void imprimi(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
