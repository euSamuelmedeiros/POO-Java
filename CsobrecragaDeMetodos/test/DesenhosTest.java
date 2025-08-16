package CsobrecragaDeMetodos.test;

import CsobrecragaDeMetodos.Dominio.desenhos;

public class DesenhosTest {
    public static void main(String[] args) {
        desenhos desenho = new desenhos();
        desenho.intic("rei leao", 40, "TV", "Açao");
        desenho.imprimeDesenho();

    }
}
