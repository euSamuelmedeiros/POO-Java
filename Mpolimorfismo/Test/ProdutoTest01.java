package Mpolimorfismo.Test;


import Mpolimorfismo.Domain.Computador;
import Mpolimorfismo.Domain.Televisao;
import Mpolimorfismo.Domain.Tomate;
import Mpolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook Pro", 10000);
        Tomate tomate = new Tomate("Tomatão", 10);
        Televisao televisao = new Televisao("LG", 2000);

        
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(televisao);

        
    }


}
