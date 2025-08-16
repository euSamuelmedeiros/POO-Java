package TreinoClassesAbstratas.Domain;

public class Cat extends Animal{

    @Override
    public void fazerSom() {
      System.out.println("O gato mia");
    }

    public Cat(String name){
         super(name);
    }
    
}
