package Hhereança.test;

import Hhereança.domain.Endereço;
import Hhereança.domain.Funcionario;
import Hhereança.domain.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("judiditi silva carvalho");
        endereço.setCep("123456-123");

        Pessoa pessoa = new Pessoa("diogo");
        pessoa.setcpf("584141074-68");
        pessoa.setEndereço(endereço);
        pessoa.imprimeai();

        Funcionario funcionario = new Funcionario("samuel");
        funcionario.setSalario(20000);
        funcionario.setcpf("33333333333");
        funcionario.setEndereço(endereço);
        System.out.println("------------");
        funcionario.imprimeai();
    }

}
