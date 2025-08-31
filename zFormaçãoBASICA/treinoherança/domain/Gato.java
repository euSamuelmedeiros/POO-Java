package zFormaçãoBASICA.treinoherança.domain;

public class Gato extends Animal {

    public Gato(String name) {
        super(name);
    }

    public void FazerSom(){
        System.out.println("o gato mia");
    }
}
