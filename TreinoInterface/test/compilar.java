package TreinoInterface.test;

import TreinoInterface.domain.Cat;
import TreinoInterface.domain.Dog;

public class compilar {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.emitirSom();
        cat.emitirSom();
    }
    
}
