

import java.util.Scanner;

public class pratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua primeira nota? ");
        float notice1 = input.nextFloat();

        System.out.println("Qual a sua segunda nota? ");
        float notice2 = input.nextFloat();

        double average = (notice1 + notice2) / 2;
        String phrase;
        if (average < 5) {
            phrase = String.format("Sua média foi %.1f. Infelizmente, você foi REPROVADO.", average);
        } else if (average >= 5 && average < 7) {
            phrase = String.format("sua media foi %.1f vc esta de RECUPERAÇÂO", average);
        } else {
            phrase = String.format("Sua media foi %.1f e vc foi APROVADO", average);
        }
        System.out.println(phrase);

        input.close();

        input.close();

         /*
         * Scanner input = new Scanner(System.in);
         * System.out.print("Qual é a sua idade? ");
         * int age = input.nextInt();
         * if (age < 15) {
         * System.out.println("sua categoria é a infantil");
         * } else if (age >= 15 && age < 18) {
         * System.out.println("sua categoria é a juvenil");
         * } else {
         * System.out.println("sua categoria é a dos adultos");
         * }
         * 
         * input.close();
         */

    }

}
