package Zgenerics.Test;

public class wildCardTest01 {
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


}
