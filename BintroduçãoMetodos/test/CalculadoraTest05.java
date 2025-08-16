package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] numbers = { 1, 2, 3, 4, 5, };
        calc.somaArrays(numbers);

        calc.somaVarArgs(1, 2, 3, 4, 5);
    }
}
