package introduçãoJavaClasses.test;

import introduçãoJavaClasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.year = 1990;
        car1.name = "opalao";
        car1.model = "carreiraGt";

        car2.year = 2000;
        car2.name = "Fuscao bala";
        car2.model = "lambo";

        System.out.println("\n carro 1");
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.name);

        System.out.println("\n carro 2");
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.name);
    }

}
