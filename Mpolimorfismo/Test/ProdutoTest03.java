package Mpolimorfismo.Test;

import Mpolimorfismo.Domain.Produto;
import Mpolimorfismo.Domain.Computador;
import Mpolimorfismo.Domain.Tomate;
import Mpolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen 8", 6000);

        System.out.println("--------------------");

        Tomate tomate = new Tomate("americano", 6);
        tomate.setDataDeValidade("11/5/2019");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}