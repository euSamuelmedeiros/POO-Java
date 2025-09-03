package Zgenerics.Test;

import java.util.List;

public class wildCardTest02 {
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

    public static void main(String[] args) {

    }

    public static void PrintConsulta(List<Animal> animals){
        for (Animal animal : animals) {

            
        }

    }


}
