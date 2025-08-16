package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Calculadora;

public class calculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadoraTest01");
        calculadora.soubtrairDoisvalores();
    }
}
