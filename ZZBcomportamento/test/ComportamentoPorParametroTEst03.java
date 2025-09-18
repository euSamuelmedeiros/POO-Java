package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTEst03 {
    private static List<Car> carList = List.of(new Car(1994, "green"), new Car(1999, "Preto"), new Car(1788, "red"));

    public static void main(String[] args) {
        List<Car> CarRed = filtro(carList, car -> car.getColor().equals("green"));
        List<Car> CarGreen = filtro(carList, car -> car.getColor().equals("red"));
        System.out.println(CarGreen);
        System.out.println(CarRed);

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filtro(integers, integer -> integer % 2  == 0));
    }


    public static <T> List<T> filtro(List<T> list, Predicate<T> predicate) {
        List<T> filtroDeListas = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtroDeListas.add(e);
            }
        }
        return filtroDeListas;

    }
}
