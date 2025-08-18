package zFormaçãoBASICA.TreinoInterface.test;

import zFormaçãoBASICA.TreinoInterface.domain.Cat;
import zFormaçãoBASICA.TreinoInterface.domain.Dog;

public class compilar {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.emitirSom();
        cat.emitirSom();
    }
    
}
