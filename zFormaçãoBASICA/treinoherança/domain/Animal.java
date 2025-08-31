package zFormaçãoBASICA.treinoherança.domain;

public class Animal {
    protected String Name;

    public  void  FazerSom(){
        System.out.println("Som generico de animais.");
    }

    public Animal(String name) {
        Name = name;
    }
}
