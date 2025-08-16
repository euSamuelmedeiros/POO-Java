package BintroduçãoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void soubtrairDoisvalores() {
        System.out.println(60 - 30);
    }

    public void multipliqueDoisNumeros(int number1, int number2) {
        System.out.println(number1 * number2);
    }
  
    public double divideDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void altereDoisNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 20;
        System.out.println("dentro do alteredoisnumeros ");
        System.out.println("num1 " + num1);
        System.out.println("num1 " + num2);
    }

    public void somaArrays(int[] numbers) {
        int soma = 0;
        for (int num : numbers) {
            soma += num;

        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numbers){
        int soma = 0;
        for(int num: numbers){
            soma += num;
        }
        System.out.println(soma);
    }

}
