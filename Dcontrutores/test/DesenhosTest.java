package Dcontrutores.test;

import Dcontrutores.Dominio.Desenhos;

public class DesenhosTest {
    public static void main(String[] args) {
        Desenhos desenho = new Desenhos("samuca", 40, "TV", "açao", "production Ig");
        
       // desenho.intic("rei leao", 40, "TV", "Açao");
        desenho.imprimeDesenho();
        

    }
}
