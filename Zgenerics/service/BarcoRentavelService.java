package Zgenerics.service;

import Zgenerics.Domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcoDisponiveis = new ArrayList<>(List.of(new Barco("cruzeiro"), new Barco("Canoa")));

    public Barco barcosdisponiveis(){
        System.out.println("Buscando barco disponiveis....");
        Barco barco = BarcoDisponiveis.remove(0);
        System.out.println("Alugando barco..." + barco);
        System.out.println("barco disponiveis para alugar: ");
        System.out.println(BarcoDisponiveis);

        return barco;
    }

    public void  RetornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco " + barco);
        BarcoDisponiveis.add(barco);
        System.out.println("barcos disponiveis: " );
        System.out.println(BarcoDisponiveis);
    }

}
