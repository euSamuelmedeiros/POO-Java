package TreinoClassesAbstratas.Test;

import TreinoClassesAbstratas.Domain.Cat;
import TreinoClassesAbstratas.Domain.Dog;

public class AnimalTest {
    public static void main(String[] args) {
       Dog cachorro = new Dog("Apolo");
       Cat gato = new Cat("rex");

       cachorro.fazerSom();
       gato.fazerSom();
    }
    
}
