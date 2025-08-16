package Lclassesabstratas.test;

import Lclassesabstratas.domain.Desenvolvedor;
import Lclassesabstratas.domain.Gerente;

public class EmployeTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("samuca", 15000);
        Desenvolvedor dese = new Desenvolvedor("pedro", 5000);
        System.out.println(gerente);
        System.out.println(dese);
        gerente.imprime();
        dese.imprime();
    }

}
