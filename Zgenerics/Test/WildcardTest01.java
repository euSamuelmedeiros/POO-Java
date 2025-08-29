package Zgenerics.Test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("consultando gato");
    }
}


public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorro = {new Cachorro(), new Cachorro()};
        Gato[] gatoes = {new Gato(), new Gato()};

        printConsulta(cachorro);
        printConsulta(gatoes);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }
}
