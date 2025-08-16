

import java.util.Scanner;

public class preitcaBREAK {
    public static void main(String[] args) {
        int max = 50;
        for (int i = 0; i < max; i++) {
            if (i > 25) {
                break;

            }
            System.out.println(i);
        }

        int age = 10;
        for (int c = 0; c < age; c++) {
            if (c > age) {
                break;
            }
            System.out.println(c);

        }

        int maxx = 5;
        for (int l = 0; l < maxx; l++) {
            System.out.println("ola");
        }

        Scanner input = new Scanner(System.in);
        int ma = 4;
        for (int m = 0; m < ma; m++) {
            System.out.println("Qual é a sua idade? ");
            int num1 = input.nextInt();
            System.out.println(num1);

            input.close();
        }
    }
}