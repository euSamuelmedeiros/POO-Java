

public class rraysMultidimencionaisTreino {
    public static void main(String[] args) {
        /*
         * int[][] number = new int[2][2];
         * 
         * number[0][0] = 1;
         * number[0][1] = 2;
         * 
         * number[1][0] = 3;
         * number[1][1] = 4;
         * 
         * for (int i = 0; i < number.length; i++) {
         * for (int j = 0; j < number[0].length; j++) {
         * System.out.println(number[i][j]);
         * }
         * }
         */

        int[][] day = new int[2][3];

        day[0][0] = 2;
        day[0][1] = 4;
        day[0][2] = 6;

        day[1][0] = 8;
        day[1][1] = 10;
        day[1][2] = 12;

        for (int i = 0; i < day.length; i++) {
            for (int j = 0; j < day[0].length; j++) {
                System.out.println(day[i][j]);

            }

        }

        System.out.println("-------------------------------");
        for (int[] arrBase : day) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}