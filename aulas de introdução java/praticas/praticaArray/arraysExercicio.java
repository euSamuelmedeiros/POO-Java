

public class arraysExercicio {
    public static void main(String[] args) {
        /*
         * int[] number = new int[]{10, 20, 30, 40};
         * for(int i = 0; i < number.length; i++){
         * System.out.println(number[i]);
         * }
         */

        int[] number = new int[] { 2, 4, 5, 19, 4, 12 };
        int cout = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                cout++;
            }
        }
        System.out.println("the number of evem number are: "+ cout);
    }
}
