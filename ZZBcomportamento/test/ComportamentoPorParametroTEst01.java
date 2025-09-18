package ZZBcomportamento.test;

import ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTEst01 {
    private static List<Car> carList = List.of(new Car(1994, "Verde"), new Car(1999, "Preto"), new Car(1788, "Vermelho"));

    public static void main(String[] args) {
        System.out.println(filtroDeCarroverde(carList));
        System.out.println(filtroDeCarroVermelho(carList));
        System.out.println("---------------------------------");
        System.out.println(filtroDeCarros(carList, "Verde"));
        System.out.println(filtroDeCarros(carList, "Vermelho"));
        System.out.println(filtroDeCarrosAge(carList, 2016));

    }

    public static List<Car> filtroDeCarroverde(List<Car> cars) {
        List<Car> CarrosVerdes = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Verde")) {
                CarrosVerdes.add(car);
            }

        }
        return CarrosVerdes;

    }

    public static List<Car> filtroDeCarroVermelho(List<Car> cars) {
        List<Car> CarrosVermelhos = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("Vermelho")) {
                CarrosVermelhos.add(car);
            }

        }
        return CarrosVermelhos;

    }

    public static List<Car> filtroDeCarros(List<Car> cars, String cor) {
        List<Car> filtroDeCarros = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                filtroDeCarros.add(car);
            }

        }
        return filtroDeCarros;

    }

    public static List<Car> filtroDeCarrosAge(List<Car> cars, int ano) {
        List<Car> filtroDeCarrosAge = new ArrayList<>();
        for (Car car : cars) {
            if (car.getAno() < ano) {
                filtroDeCarrosAge.add(car);
            }

        }
        return filtroDeCarrosAge;

    }
}
