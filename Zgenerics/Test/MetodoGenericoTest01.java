package Zgenerics.Test;

import Zgenerics.Domain.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        CriararrayComUmOnjeto(new Barco("Canoa Marota"));
    }

    private static <T> void CriararrayComUmOnjeto(T t){
        List<T> tList = List.of(t);
        System.out.println(tList);
    }
}
