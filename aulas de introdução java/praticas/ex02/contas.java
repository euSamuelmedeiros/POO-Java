

import java.util.Scanner;

public class contas {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
           String name = "Samuel";
           String math = "matematica";

           System.out.print("Qual é a primeira nota? ");
           double nota1 = input.nextDouble();
           System.out.print("qual é a segunda nota? ");
           double nota2 = input.nextDouble();
           double media = (nota1 + nota2) / 2;     
           var sentenci = String.format("O aluno %s obteve a media %.1f em %s", name, media, math);
           System.out.println(sentenci);

           input.close(); */

           // exercicio 02
         Scanner input = new Scanner(System.in);

         System.out.print("Qual é o primeiro numero? ");
         double number1 = input.nextDouble();
         System.out.print("Qual é o segundo numero? ");
         double number2 = input.nextDouble();
         double res = number1 + number2;
         var sentence = String.format("A soma dos valores %.0f e %.0f é igual a %.0f", number1, number2, res);
         System.out.println(sentence);

         input.close();                     

    }
}
