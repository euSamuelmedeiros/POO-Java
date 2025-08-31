package zFormaçãoBASICA.praticaSobrecagraDeMetodos.test;

import zFormaçãoBASICA.praticaSobrecagraDeMetodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Luiz felipe");
        Pessoa pessoa1 = new Pessoa("Luiz Felipe", 16);
        Pessoa pessoa2 = new Pessoa("Luiz Felipe", 16, "Mecanico");


        System.out.println(pessoa);
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}
