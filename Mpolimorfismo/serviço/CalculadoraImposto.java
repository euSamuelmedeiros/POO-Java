package Mpolimorfismo.serviço;

import Mpolimorfismo.Domain.Produto;
import Mpolimorfismo.Domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("relatorio de imposto");
        double imposto = produto.taxavel();
        System.out.println("Produto: " + produto.getName());
        System.out.println("preço: " + produto.getValor());
        System.out.println("valor de imposto a ser pago: " + imposto);

        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
        }
    }

}
