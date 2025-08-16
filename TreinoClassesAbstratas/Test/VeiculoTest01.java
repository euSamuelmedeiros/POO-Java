package TreinoClassesAbstratas.Test;

import TreinoClassesAbstratas.Domain.Car;
import TreinoClassesAbstratas.Domain.Moto;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Car car = new Car("opalao");
        Moto moto = new Moto("BMW 320");

        car.Mover();
        moto.Mover();
    }
    
}
