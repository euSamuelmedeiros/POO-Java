package TreinoClassesAbstratas.Domain;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void exibirName(){
        System.out.println("Nome" + name); // metodo concreto
    }

    public abstract void fazerSom(); //metodo abstrato

    
}
