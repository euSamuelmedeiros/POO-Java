package Kenumeracao.test;


import Kenumeracao.domain.Cliente;
import Kenumeracao.domain.TIpoCliente;

public class Cleintetest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("naruto", TIpoCliente.PESSOA_FISICA, Cliente.tipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("pedrao", TIpoCliente.PESSOA_JURIDICA, Cliente.tipoPagamento.CREDITO);
        

        System.out.println(cliente1);
        System.out.println(cliente2);
       
    }
}
