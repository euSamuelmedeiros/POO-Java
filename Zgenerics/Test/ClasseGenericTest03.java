package Zgenerics.Test;

import Zgenerics.Domain.Barco;
import Zgenerics.Domain.Car;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericTest03 {
    public static void main(String[] args) {
        List<Barco> BarcoDisponiveis = new ArrayList<>(List.of(new Barco("cruzeiro"), new Barco("Canoa")));
        List<Car> carrosDisponiveis = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

        RentalService<Barco> barcoRentalService = new RentalService<>(BarcoDisponiveis);
        RentalService<Car> carRentalService = new RentalService<>(carrosDisponiveis);

        Car carro = carRentalService.BuscarObjetosDisponiveis();
        System.out.println("Usando o carro por um mes....");
        carRentalService.RetornarObjetoAlugado(carro);

        System.out.println("------------");

        Barco barco = barcoRentalService.BuscarObjetosDisponiveis();
        System.out.println("Usando o Barco por um mes....");
        barcoRentalService.RetornarObjetoAlugado(barco);








    }
}
