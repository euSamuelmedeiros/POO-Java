package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;
import ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTEst02 {
    private static List<Car> carList = List.of(new Car(1994, "green"), new Car(1999, "Preto"), new Car(1788, "red"));

    public static void main(String[] args) {
        List<Car> CarRed = filtro(carList, car -> car.getColor().equals("green"));
        List<Car> CarGreen = filtro(carList, car -> car.getColor().equals("red"));
        System.out.println(CarGreen);
        System.out.println(CarRed);
    }

    public static List<Car> filtro(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filtroDeCarros = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filtroDeCarros.add(car);
            }

        }
        return filtroDeCarros;

    }
}
