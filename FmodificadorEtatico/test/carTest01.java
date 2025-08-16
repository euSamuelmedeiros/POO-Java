package FmodificadorEtatico.test;

import FmodificadorEtatico.dominio.car;

public class carTest01 {
    public static void main(String[] args) {
        car c1 = new car("lambo", 350);
        car c2 = new car("BMW", 250);
        car c3 = new car("Mercedes", 269);

        car.setLimitSpeed(140);

        c1.imprimee();
        c2.imprimee();
        c3.imprimee();
    }

}
