package Zgenerics.Test;

import Zgenerics.Domain.Car;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Car carro = carroRentavelService.carrosdisponiveis();
        System.out.println("Usando o carro por um mes....");
        carroRentavelService.RetornarCarroAlugado(carro);

    }
}
