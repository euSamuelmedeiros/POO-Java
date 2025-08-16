package Isobrescrita.Domain;


public class Animee {

    private String name;

    
    public Animee(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "nome do anime: "+ this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
}
