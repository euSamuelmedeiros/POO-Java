package Mpolimorfismo.Test;

import Mpolimorfismo.Domain.Computador;
import Mpolimorfismo.Domain.Produto;
import Mpolimorfismo.Domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("ryzen 8", 6000); // produto --> superCLasse e computador é a extenção/subClasse
        System.out.println(produto.getName());
        System.out.println(produto.getValor());
        System.out.println(produto.taxavel());

        System.out.println("--------------------");

            Produto produto2 = new Tomate("americano", 6); 
        System.out.println(produto2.getName());
        System.out.println(produto2.getValor());
         System.out.println(produto2.taxavel());
    }
    
}
