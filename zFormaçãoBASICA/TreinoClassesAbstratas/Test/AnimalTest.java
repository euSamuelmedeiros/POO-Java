package zFormaçãoBASICA.TreinoClassesAbstratas.Test;

import zFormaçãoBASICA.TreinoClassesAbstratas.Domain.Cat;
import zFormaçãoBASICA.TreinoClassesAbstratas.Domain.Dog;

public class AnimalTest {
    public static void main(String[] args) {
       Dog cachorro = new Dog("Apolo");
       Cat gato = new Cat("rex");

       cachorro.fazerSom();
       gato.fazerSom();
    }
    
}
