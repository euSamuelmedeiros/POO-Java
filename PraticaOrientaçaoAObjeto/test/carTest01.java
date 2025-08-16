package PraticaOrientaçaoAObjeto.test;

import PraticaOrientaçaoAObjeto.dominio.car;

public class carTest01 {
    public static void main(String[] args) {
        car car01 = new car();

        car01.model = "fuscao bala";
        car01.name = "sla meo";
        car01.year = 1990;
        System.out.println(car01.model);
        System.out.println(car01.year);
        System.out.println(car01.name);

        System.out.println("----------------------");

        car01.sumTwoNumbers(); // ---> ja imprime sem precisar do sout
        System.out.println("fnalizando nossa soma");

        System.out.println("----------------------");

        car01.subtractTwoNumbers(); // ---> ja realizado o sout
        System.out.println("----------------------");

        car01.multiplyTwoNumbers();
        System.out.println("----------------------");

        car01.metade();
        System.out.println("----------------------");

        int res = car01.somaDoisNumbers(200, 200);
            System.out.println(res);
            System.out.println("----------------------");

            double result = car01.Div(100, 2);
            System.out.println(result);
        
        

    }

}
