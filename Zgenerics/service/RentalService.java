package Zgenerics.service;

import Zgenerics.Domain.Car;

import java.util.List;

public class RentalService <T>{
    private List<T> ObjetosDisponiveis;

    public RentalService(List<T> ObjetosDisponiveis) {
        this.ObjetosDisponiveis = ObjetosDisponiveis;

    }

    public T BuscarObjetosDisponiveis() {
        System.out.println("Buscando objetos disponiveis....");
        T t = ObjetosDisponiveis.remove(0);
        System.out.println("Alugando objetos..." + t);
        System.out.println("objetos disponiveis para alugar: ");
        System.out.println(ObjetosDisponiveis);

        return t;
    }

    public void RetornarObjetoAlugado(T t) {
        System.out.println("Devolvendo objeto " + t);
        ObjetosDisponiveis.add(t);
        System.out.println("objetos disponiveis: ");
        System.out.println(ObjetosDisponiveis);
    }

}
