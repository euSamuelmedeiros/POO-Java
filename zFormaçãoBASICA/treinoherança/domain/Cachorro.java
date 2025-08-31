package zFormaçãoBASICA.treinoherança.domain;

public class Cachorro extends  Animal{

    public Cachorro(String name) {
        super(name);
    }

    public void FazerSom(){
        System.out.println("O cachorro late");
    }
}
