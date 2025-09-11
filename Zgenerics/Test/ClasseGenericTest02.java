package Zgenerics.Test;

import Zgenerics.Domain.Barco;
import Zgenerics.Domain.Car;
import Zgenerics.service.BarcoRentavelService;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.barcosdisponiveis();
        System.out.println("Usando o barco por um mes....");
        barcoRentavelService.RetornarBarcoAlugado(barco);

    }
}
