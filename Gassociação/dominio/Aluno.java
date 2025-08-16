package Gassociação.dominio;

public class Aluno {
    private String name;
    private int age;
   

    public Aluno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setname(String name) {
        this.name = name;

    }

    public String getname() {
        return name;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
