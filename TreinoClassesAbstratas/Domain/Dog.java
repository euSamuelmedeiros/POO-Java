package TreinoClassesAbstratas.Domain;

public class Dog extends Animal {

  public Dog(String name){
    super(name);
  }
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}
