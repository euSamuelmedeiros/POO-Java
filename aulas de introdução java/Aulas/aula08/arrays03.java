package aula08;

public class arrays03 {
    public static void main(String[] args) {
        //int[] numbers = new int[3];
        //int[] number2 = { 1, 2, 3, 4, 5 };
        int[] number3 = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < number3.length; i++) {
            System.out.println(number3[i]);

        }
        for(int i : number3 ){
            System.err.println(i);
        }

    }
}
