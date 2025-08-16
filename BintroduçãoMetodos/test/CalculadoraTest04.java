package BintroduçãoMetodos.test;

import BintroduçãoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calc.altereDoisNumbers(num1, num2);
        System.out.println("dentro do calculadoraTest04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
