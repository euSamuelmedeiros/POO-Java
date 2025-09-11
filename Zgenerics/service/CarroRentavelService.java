package Zgenerics.service;

import Zgenerics.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Car> carrosDisponiveis = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car carrosdisponiveis(){
        System.out.println("Buscando carros disponiveis....");
        Car car = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro..." + car);
        System.out.println("carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);

        return car;
    }

    public void  RetornarCarroAlugado(Car car){
        System.out.println("Devolvendo Carro " + car);
        carrosDisponiveis.add(car);
        System.out.println("carros disponiveis: " );
        System.out.println(carrosDisponiveis);
    }

}
